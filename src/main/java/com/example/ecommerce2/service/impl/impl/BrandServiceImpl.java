package com.example.ecommerce2.service.impl.impl;

import com.example.ecommerce2.mapper.BrandMapper;
import com.example.ecommerce2.model.dto.request.BrandRequest;
import com.example.ecommerce2.model.dto.response.BrandResponse;
import com.example.ecommerce2.model.entity.Brand;
import com.example.ecommerce2.model.enums.Exceptions;
import com.example.ecommerce2.model.exceptions.ApplicationException;
import com.example.ecommerce2.repository.BrandRepo;
import com.example.ecommerce2.service.impl.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BrandServiceImpl implements BrandService {
    private final BrandRepo brandRepo;
    private final BrandMapper brandMapper;

    @Override
    public List<BrandResponse> getBrands() {
        List<Brand> brandList = brandRepo.findAll();

        return brandList
                .stream()
                .map(brand -> brandMapper.mapper(brand))
                .collect(Collectors.toList());
    }

    @Override
    public void postBrand(BrandRequest brandRequest) {
        brandRepo.save(brandMapper.mapper(brandRequest));
    }

    @Override
    public BrandResponse getBrandById(Long id) {
        return brandMapper.mapper(brandRepo.findById(id)
                .orElseThrow(() -> new ApplicationException(Exceptions.BRAND_NOT_FOUND)));
    }

    @Override
    public void updateBrandById(Long id, BrandRequest brandRequest) {
        Brand brand = brandRepo.findById(id).orElseThrow(() -> new ApplicationException(Exceptions.BRAND_NOT_FOUND));
        brand.setDescription(brandRequest.getDescription());
        brand.setName(brand.getName());
        brandRepo.save(brand);
    }
}