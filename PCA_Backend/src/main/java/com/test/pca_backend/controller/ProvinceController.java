package com.test.pca_backend.controller;

import com.test.pca_backend.pojo.Province;
import com.test.pca_backend.service.Impl.ProvinceServiceImpl;
import com.test.pca_backend.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ProvinceController {
    @Autowired
    private ProvinceServiceImpl provinceServiceImpl;

    @RequestMapping("/selectAllProvince")
    @ResponseBody
    public List<Province> selectAllProvince(){
        System.out.println("bfasdfuasyfg");
        return provinceServiceImpl.getAllProvince();
    }
}
