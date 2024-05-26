package com.example.ecommerce2.mapper.impl;

import com.example.ecommerce2.mapper.BrandMapper;
import com.example.ecommerce2.model.dto.request.BrandRequest;
import com.example.ecommerce2.model.dto.response.BrandResponse;
import com.example.ecommerce2.model.entity.Brand;
import org.springframework.stereotype.Service;

@Service
public class BrandMapperImpl implements BrandMapper {
    @Override
    public BrandResponse mapper(Brand brand) {
        return BrandResponse.builder()
                .name(brand.getName())
                .description(brand.getDescription())
                .id(brand.getId())
                .build();
    }

    @Override
    public Brand mapper(BrandRequest brandRequest) {
        return Brand.builder()
                .name(brandRequest.getName())
                .description(brandRequest.getDescription())
                .id(brandRequest.getId())
                .build();
    }
}