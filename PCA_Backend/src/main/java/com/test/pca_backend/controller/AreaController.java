package com.test.pca_backend.controller;

import com.test.pca_backend.pojo.Area;
import com.test.pca_backend.service.Impl.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AreaController {
    @Autowired
    private AreaServiceImpl areaServiceImpl;


    @RequestMapping("/selectAreaByID")
    public List<Area> selectAreaByID(int id){
        return areaServiceImpl.selectAreaByID(id);
    }

}
