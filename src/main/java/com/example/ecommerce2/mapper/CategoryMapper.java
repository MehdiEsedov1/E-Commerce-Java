package com.example.ecommerce2.mapper;

import com.example.ecommerce2.model.dto.request.CategoryRequest;
import com.example.ecommerce2.model.dto.response.CategoryResponse;
import com.example.ecommerce2.model.entity.Category;

public interface CategoryMapper {
    CategoryResponse map(Category category);

    Category map(CategoryRequest categoryRequest);
}