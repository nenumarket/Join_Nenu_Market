package com.nenujoin.demo.totalvisit;

import com.nenujoin.demo.entity.totalvisit.City;
import com.nenujoin.demo.service.totalvisit.TotalVisitService;
import com.nenujoin.demo.util.ReadExcel;
import com.nenujoin.demo.util.VisitCompany;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 20:59 2019/4/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testUtil {

    @Resource
    TotalVisitService totalVisitService;

    @Test
    public void testVisitCity() throws Exception {
        ReadExcel readExcel = new ReadExcel();
        String strExcel = readExcel.PoiTest();
        VisitCompany visitCompany = new VisitCompany();
        System.out.println(visitCompany.visitCity(strExcel));
        Map<String,Integer> map = visitCompany.visitCity(strExcel);
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getKey();
            Integer visitCount = entry.getValue();
            City city = new City();
            city.setCityName(str);
            city.setVisitCount(visitCount);
            city.setYear(2019);
            totalVisitService.addVisitCity(city);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }
    }

    @Test
    public void testReturnCity() throws Exception {
        ReadExcel readExcel = new ReadExcel();
        String strExcel = readExcel.PoiTest2();
        VisitCompany visitCompany = new VisitCompany();
        System.out.println(visitCompany.returnCity(strExcel));
        Map<String,Integer> map = visitCompany.returnCity(strExcel);
        System.out.println(map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String str = entry.getKey();
            Integer returnCount = entry.getValue();
            City city = new City();
            city.setCityName(str);
            city.setReturnCount(returnCount);
            totalVisitService.addReturnCity(city);
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
        }
    }

}

