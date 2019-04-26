package com.nenujoin.demo.mapper.city;

import com.nenujoin.demo.entity.city.Education;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EducationMapper {

    /**
     * 遍历
     */
    public List<Education> listAll() throws Exception;


    /**
     * 根据城市名查询
     */
    public List<Education> selectEducationByCityName(String city_name) throws Exception;


    /**
     * 根据关键字查询
     */
    public List<Education> selectEducationByKeyword(String keyword) throws Exception;
}
