package com.example.ecommerce2.mapper;

import com.example.ecommerce2.model.dto.request.ProductRequest;
import com.example.ecommerce2.model.dto.response.ProductResponse;
import com.example.ecommerce2.model.entity.Product;

public interface ProductMapper {
    ProductResponse map(Product product);
    Product map(ProductRequest productRequest);
}