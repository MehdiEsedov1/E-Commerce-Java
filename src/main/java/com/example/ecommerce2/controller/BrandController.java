package com.example.ecommerce2.controller;

import com.example.ecommerce2.model.dto.request.BrandRequest;
import com.example.ecommerce2.model.dto.response.BrandResponse;
import com.example.ecommerce2.service.impl.BrandService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brand")
@Tag(name = "Brand Controller", description = "This is controller about brands")
public class BrandController {
    private final BrandService brandService;

    @GetMapping("/getBrand")
    List<BrandResponse> getBrands() {
        return brandService.getBrands();
    }

    @PostMapping("/postBrand")
    void postBrand(@RequestBody @Valid BrandRequest brandRequest){
        brandService.postBrand(brandRequest);
    }

    @GetMapping("/getBrandById/{id}")
    BrandResponse getBrandById(@PathVariable Long id){
        return brandService.getBrandById(id);
    }

    @PutMapping("/updateBrand/{id}")
    void updateBrandById(@PathVariable Long id,@RequestBody BrandRequest brandRequest){
        brandService.updateBrandById(id,brandRequest);
    }
}