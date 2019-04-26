package com.nenujoin.demo.service.totalvisit;

import com.nenujoin.demo.entity.totalvisit.City;

import java.util.List;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 18:04 2019/4/16
 */
public interface TotalVisitService {

    public boolean addVisitCity(City city) throws Exception;

    public boolean addReturnCity(City city) throws Exception;

    public List<City> listAllCity() throws Exception;
}

