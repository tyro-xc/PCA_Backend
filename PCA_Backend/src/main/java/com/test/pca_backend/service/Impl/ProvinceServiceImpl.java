package com.test.pca_backend.service.Impl;

import com.test.pca_backend.mapper.ProvinceMapper;
import com.test.pca_backend.pojo.Province;
import com.test.pca_backend.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;
    @Override
    public List<Province> getAllProvince() {
        return provinceMapper.getAllProvinces();
    }
}
