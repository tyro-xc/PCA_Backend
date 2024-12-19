package com.test.pca_backend.service.Impl;

import com.test.pca_backend.mapper.AreaMapper;
import com.test.pca_backend.pojo.Area;
import com.test.pca_backend.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> selectAreaByID(int id) {
        return areaMapper.selectAreaByID(id);
    }
}
