package com.example.ecommerce2.service.impl;

import com.example.ecommerce2.model.dto.request.BrandRequest;
import com.example.ecommerce2.model.dto.response.BrandResponse;

import java.util.List;

public interface BrandService {
    List<BrandResponse> getBrands();

    void postBrand(BrandRequest brandRequest);

    BrandResponse getBrandById(Long id);

    void updateBrandById(Long id, BrandRequest brandRequest);
}