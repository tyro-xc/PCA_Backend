package com.test.pca_backend.service.Impl;

import com.test.pca_backend.mapper.CityMapper;
import com.test.pca_backend.pojo.City;
import com.test.pca_backend.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public City selectCityByID(int id) {
        return cityMapper.selectCityById(id);
    }
}
