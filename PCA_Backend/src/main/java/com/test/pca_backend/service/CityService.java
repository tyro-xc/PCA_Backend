package com.test.pca_backend.service;

import com.test.pca_backend.pojo.City;

import java.util.List;

public interface CityService {

    List<City> selectCityByID(int id);
}
