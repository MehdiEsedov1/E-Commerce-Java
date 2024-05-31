package com.example.ecommerce2.mapper.impl;

import com.example.ecommerce2.mapper.CategoryMapper;
import com.example.ecommerce2.model.dto.request.CategoryRequest;
import com.example.ecommerce2.model.dto.response.CategoryResponse;
import com.example.ecommerce2.model.entity.Category;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapperImpl implements CategoryMapper {
    @Override
    public CategoryResponse map(Category category) {
        return CategoryResponse.builder()
                .name(category.getName())
                .description(category.getDescription())
                .id(category.getId())
                .build();
    }

    @Override
    public Category map(CategoryRequest categoryRequest) {
        return Category.builder()
                .name(categoryRequest.getName())
                .description(categoryRequest.getDescription())
                .build();
    }
}