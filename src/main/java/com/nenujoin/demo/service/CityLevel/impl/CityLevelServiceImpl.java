package com.nenujoin.demo.service.CityLevel.impl;

import com.nenujoin.demo.entity.CityLevel.CityLevel;
import com.nenujoin.demo.mapper.CityLevelMapper.CityLevelMapper;
import com.nenujoin.demo.service.CityLevel.CityLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("CityLevelService")
public class CityLevelServiceImpl implements CityLevelService {
    @Autowired
    CityLevelMapper cityLevelMapper;

    @Override
    public List<CityLevel> listAllCityLevel() throws Exception{
        List<CityLevel> cityLevelList = Collections.emptyList();
        try{
            cityLevelList = cityLevelMapper.listAllCityLevel();
        }catch (Exception e){
            System.out.println("列出所有城市分级出错");
        }
        return cityLevelList;
    }

    @Override
    public void addCityLevel(CityLevel cityLevel) throws Exception{
        try{
            cityLevelMapper.addCityLevel(cityLevel);
        }catch (Exception e){
            System.out.println("增加城市分级出错");
        }
    }

    @Override
    public boolean deleteCityLevel(int id) throws Exception{
            return cityLevelMapper.deleteCityLevel(id);
    }

    @Override
    public void updateCityLevel(CityLevel cityLevel) throws Exception{
        try{
            cityLevelMapper.updateCityLevel(cityLevel);
        }catch (Exception e){
            System.out.println("增加城市分级出错");
        }
    }

    @Override
    public CityLevel searchCityLevelById(int id) throws Exception{
        return cityLevelMapper.searchCityLevelById(id);
    }

    @Override
    public List<CityLevel> searchCityLevel(String key) throws Exception{
        return cityLevelMapper.searchCityLevel(key);
    }
}
