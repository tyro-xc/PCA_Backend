package com.test.pca_backend.mapper;

import com.test.pca_backend.pojo.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProvinceMapper {

    @Select("select * from province")
    List<Province> getAllProvinces();
}
