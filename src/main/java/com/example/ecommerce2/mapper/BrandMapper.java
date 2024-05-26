package com.example.ecommerce2.mapper;

import com.example.ecommerce2.model.dto.request.BrandRequest;
import com.example.ecommerce2.model.dto.response.BrandResponse;
import com.example.ecommerce2.model.entity.Brand;

public interface BrandMapper {
    BrandResponse mapper(Brand brand);

    Brand mapper(BrandRequest brandRequest);
}