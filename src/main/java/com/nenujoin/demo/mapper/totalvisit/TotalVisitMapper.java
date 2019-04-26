package com.nenujoin.demo.mapper.totalvisit;

import com.nenujoin.demo.entity.totalvisit.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @Author:Liangll
 * @Description:
 * @Date: 17:35 2019/4/16
 */
@Mapper
@Repository
public interface TotalVisitMapper {

//    public List listAll(int year) throws Exception;

    /**
     *
     * @param city
     * @return
     * @throws Exception
     */
    public boolean addVisitCity(@Param("City")City city) throws Exception;

    public boolean addReturnCity(@Param("City")City city) throws Exception;

    public List<City> listAllCity() throws Exception;

}
