package com.nenujoin.demo.service.totalvisit.impl;

import com.nenujoin.demo.entity.totalvisit.City;
import com.nenujoin.demo.mapper.totalvisit.TotalVisitMapper;
import com.nenujoin.demo.service.totalvisit.TotalVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 18:05 2019/4/25
 */
@Service
public class TotalVisitServiceImpl implements TotalVisitService {

    @Autowired
    TotalVisitMapper totalVisitMapper;

    @Override
    public boolean addVisitCity(City city) throws Exception {
        return totalVisitMapper.addVisitCity(city);
    }

    @Override
    public boolean addReturnCity(City city) throws Exception {
        return totalVisitMapper.addReturnCity(city);
    }

    @Override
    public List<City> listAllCity() throws Exception{
        List<City> cityList = Collections.emptyList();
        try{
            cityList = totalVisitMapper.listAllCity();
        }catch (Exception e){
            System.out.println("列出城市出错");
        }
        return cityList;
    }
}

