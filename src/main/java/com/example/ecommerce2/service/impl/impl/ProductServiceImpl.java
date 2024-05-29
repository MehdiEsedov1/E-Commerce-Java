package com.example.ecommerce2.service.impl.impl;

import com.example.ecommerce2.mapper.ProductMapper;
import com.example.ecommerce2.model.dto.request.ProductRequest;
import com.example.ecommerce2.model.dto.response.ProductResponse;
import com.example.ecommerce2.model.entity.Product;
import com.example.ecommerce2.model.enums.Exceptions;
import com.example.ecommerce2.model.exceptions.ApplicationException;
import com.example.ecommerce2.repository.ProductRepo;
import com.example.ecommerce2.service.impl.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    private final ProductMapper mapper;

    @Override
    public List<ProductResponse> getAllProducts() {
        List<Product> productList = productRepo.findAll();
        return productList.stream()
                .map(product -> mapper.map(product))
                .collect(Collectors.toList());
    }

    @Override
    public void postProduct(ProductRequest productRequest) {
        productRepo.save(mapper.map(productRequest));
    }

    @Override
    public ProductResponse getProductById(Long id) {
        return mapper.map(productRepo.findById(id).orElseThrow(() -> new ApplicationException(Exceptions.PRODUCT_NOT_FOUND)));
    }

    @Override
    public void updateProduct(Long id, ProductRequest productRequest) {
        Product product = productRepo.findById(id).orElseThrow(() -> new ApplicationException(Exceptions.PRODUCT_NOT_FOUND));

        product.setProductDetails(productRequest.getProductDetails());
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setAmount(productRequest.getAmount());
        product.setRemainCount(productRequest.getRemainCount());

        productRepo.save(product);
    }
}