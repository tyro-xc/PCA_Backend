package com.test.pca_backend.service;

import com.test.pca_backend.pojo.Area;

import java.util.List;

public interface AreaService {

    List<Area> selectAreaByID(int id);
}
