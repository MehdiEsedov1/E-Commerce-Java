package com.example.ecommerce2.controller;

import com.example.ecommerce2.model.dto.request.CategoryRequest;
import com.example.ecommerce2.model.dto.response.CategoryResponse;
import com.example.ecommerce2.service.impl.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
//    private final CategoryService categoryService;
//
//    @GetMapping("/getCategories")
//    List<CategoryResponse> getAllCategories() {
//        return categoryService.getAllCategories();
//    }
//
//    @PostMapping("/postCategory")
//    void postCategory(@RequestBody CategoryRequest categoryRequest) {
//        categoryService.postCategory(categoryRequest);
//    }
//
//    @GetMapping("/getCategoryById/{id}")
//    CategoryResponse getCategoryById(@PathVariable Long id) {
//        return categoryService.getCategoryById(id);
//    }
//
//    @PutMapping("updateCategory/{id}")
//    void updateCategory(@RequestBody CategoryRequest categoryRequest,@PathVariable Long id){
//        categoryService.updateCategory(categoryRequest,id);
//    }
}