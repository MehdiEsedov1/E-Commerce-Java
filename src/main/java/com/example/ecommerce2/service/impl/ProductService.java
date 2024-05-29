package com.example.ecommerce2.service.impl;

import com.example.ecommerce2.model.dto.request.ProductRequest;
import com.example.ecommerce2.model.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {
    List<ProductResponse> getAllProducts();

    void postProduct(ProductRequest productRequest);

    ProductResponse getProductById(Long id);

    void updateProduct(Long id, ProductRequest productRequest);
}