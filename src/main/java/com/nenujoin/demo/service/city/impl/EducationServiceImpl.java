package com.nenujoin.demo.service.city.impl;

import com.nenujoin.demo.entity.city.Education;
import com.nenujoin.demo.mapper.city.EducationMapper;
import com.nenujoin.demo.service.city.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Service("EducationService")

public class EducationServiceImpl implements EducationService {

    @Autowired
    EducationMapper educationMapper;

    /**
     * 遍历
     */
    @Override
    @Transactional
    public List<Education> listAll() throws Exception{
        List<Education> educationList = Collections.emptyList();
        try {
            educationList = educationMapper.listAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return educationList;
    }


    /**
     * 根据城市名查询
     */
    @Override
    @Transactional
    public List<Education> selectEducationByCityName(String city_name) throws Exception{
        List<Education> list=null;
        try{
            list = educationMapper.selectEducationByCityName(city_name);
            System.out.println(city_name+"Serv");
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据关键字查询
     */
    @Override
    @Transactional
    public List<Education> selectEducationByKeyword(String keyword) throws Exception{
        List<Education> list1 = null;
        try {
            list1 = educationMapper.selectEducationByKeyword(keyword);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list1;
    }


}
