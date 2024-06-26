package com.example.ecommerce2.controller;

import com.example.ecommerce2.model.dto.request.ProductRequest;
import com.example.ecommerce2.model.dto.response.ProductResponse;
import com.example.ecommerce2.service.impl.ProductService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
@Tag(name = "Product Controller", description = "This is controller about products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/getAllProducts")
    List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/postProduct")
    void postProduct(@RequestBody @Valid ProductRequest productRequest) {
        productService.postProduct(productRequest);
    }

    @GetMapping("/getProductById/{id}")
    ProductResponse getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/updateProduct")
    void updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        productService.updateProduct(id, productRequest);
    }
}