package com.test.pca_backend.mapper;

import com.test.pca_backend.pojo.Area;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface AreaMapper {

    @Select("select * from area where father = #{id}")
    List<Area> selectAreaByID(int id);
}
