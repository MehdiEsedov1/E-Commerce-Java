package com.example.ecommerce2.service.impl.impl;

import com.example.ecommerce2.mapper.CategoryMapper;
import com.example.ecommerce2.model.dto.request.CategoryRequest;
import com.example.ecommerce2.model.dto.response.CategoryResponse;
import com.example.ecommerce2.model.entity.Category;
import com.example.ecommerce2.model.enums.Exceptions;
import com.example.ecommerce2.model.exceptions.ApplicationException;
import com.example.ecommerce2.repository.CategoryRepo;
import com.example.ecommerce2.service.impl.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    private final CategoryMapper mapper;

    @Override
    public List<CategoryResponse> getAllCategories() {
        List<Category> categoryList = categoryRepo.findAll();
        return categoryList.stream()
                .map(category -> mapper.map(category))
                .collect(Collectors.toList());
    }

    @Override
    public void postCategory(CategoryRequest categoryRequest) {
        categoryRepo.save(mapper.map(categoryRequest));
    }

    @Override
    public CategoryResponse getCategoryById(Long id) {
        return mapper.map(categoryRepo.findById(id).orElseThrow(() -> new ApplicationException(Exceptions.CATEGORY_NOT_FOUND)));
    }

    @Override
    public void updateCategory(CategoryRequest categoryRequest, Long id) {
        Category category = categoryRepo.findById(id).orElseThrow(() -> new ApplicationException(Exceptions.CATEGORY_NOT_FOUND));
        category.setDescription(categoryRequest.getDescription());
        category.setName(categoryRequest.getName());
        categoryRepo.save(category);
    }
}