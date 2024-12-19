package com.test.pca_backend.controller;

import com.test.pca_backend.pojo.City;
import com.test.pca_backend.service.Impl.CityServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class CityController {

    @Autowired
    private CityServiceImpl cityServiceImpl;
    @RequestMapping("/selectCityByID")
    public List<City> selectCityByID(@RequestParam("id") int id) {
        System.out.println(id);
        return cityServiceImpl.selectCityByID(id);
    }

}
