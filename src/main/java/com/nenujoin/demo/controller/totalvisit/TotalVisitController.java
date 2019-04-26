package com.nenujoin.demo.controller.totalvisit;

import com.nenujoin.demo.entity.totalvisit.City;
import com.nenujoin.demo.service.totalvisit.TotalVisitService;
import com.nenujoin.demo.util.ReadExcel;
import com.nenujoin.demo.util.VisitCompany;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 21:21 2019/4/23
 */
public class TotalVisitController {
    @Resource
    TotalVisitService totalVisitService;

    @RequestMapping("/Excel")
    public void addCity() throws Exception {
//        ReadExcel readExcel = new ReadExcel();
//        String strExcel = readExcel.PoiTest();
//        VisitCompany visitCompany = new VisitCompany();
//        System.out.println(visitCompany.visit(strExcel));
//        Map<String,Integer> map = visitCompany.visit(strExcel);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            totalVisitService.addCity(entry.getKey(),entry.getValue());
//        }
    }

    @RequestMapping("st")
    public List TotalCityList() throws Exception {
        List<City> list = Collections.emptyList();
        list = totalVisitService.listAllCity();
        return list;
    }
}

