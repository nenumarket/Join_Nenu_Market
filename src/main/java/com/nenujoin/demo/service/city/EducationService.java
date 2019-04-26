package com.nenujoin.demo.service.city;

import com.nenujoin.demo.entity.city.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EducationService {

    /**
     * 遍历
     */
    public List<Education> listAll() throws Exception;

    /**
     * 根据城市名查询
     */
    public List<Education> selectEducationByCityName(String city_name) throws Exception;

    /**
     *根据关键字查询
     */
    public List<Education> selectEducationByKeyword(String keyword) throws Exception;
}