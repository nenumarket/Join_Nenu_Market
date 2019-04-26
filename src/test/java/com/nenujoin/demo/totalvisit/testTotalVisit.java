package com.nenujoin.demo.totalvisit;

import com.nenujoin.demo.service.totalvisit.TotalVisitService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:Liangll
 * @Description:
 * @Date: 11:03 2019/4/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class testTotalVisit {

    @Autowired
    TotalVisitService totalVisitService;

    @Test
    public void testListAllCityLevel() throws Exception{
        System.out.println(totalVisitService.listAllCity());
    }

}
