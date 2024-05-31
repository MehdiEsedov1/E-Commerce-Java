package com.example.ecommerce2.mapper.impl;

import com.example.ecommerce2.mapper.ProductMapper;
import com.example.ecommerce2.model.dto.request.ProductRequest;
import com.example.ecommerce2.model.dto.response.ProductResponse;
import com.example.ecommerce2.model.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapperImpl implements ProductMapper {
    @Override
    public ProductResponse map(Product product) {
        return ProductResponse.builder()
                .name(product.getName())
                .description(product.getDescription())
                .productDetails(product.getProductDetails())
                .amount(product.getAmount())
                .remainCount(product.getRemainCount())
                .id(product.getId())
                .build();
    }

    @Override
    public Product map(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .productDetails(productRequest.getProductDetails())
                .amount(productRequest.getAmount())
                .remainCount(productRequest.getRemainCount())
                .build();
    }
}