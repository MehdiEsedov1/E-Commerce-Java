package com.example.ecommerce2.service.impl;

import com.example.ecommerce2.model.dto.request.CategoryRequest;
import com.example.ecommerce2.model.dto.response.CategoryResponse;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> getAllCategories();
    void postCategory(CategoryRequest categoryRequest);
    CategoryResponse getCategoryById(Long id);
    void updateCategory(CategoryRequest categoryRequest,Long id);
}