package com.test.pca_backend.mapper;

import com.test.pca_backend.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("select * from city where father = #{id}")
    City selectCityById(int id);

}
