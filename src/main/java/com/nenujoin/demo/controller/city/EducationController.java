package com.nenujoin.demo.controller.city;

import com.nenujoin.demo.entity.city.Education;
import com.nenujoin.demo.service.city.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/testBoot")
public class EducationController{
    @Autowired
    EducationService educationService;

    /**
     * 遍历
     * @param model
     * @return
     */
    @RequestMapping(value = "/listAll")
    public List<Education> educationList(Model model){
        List<Education> list = null;
        try {
            list=educationService.listAll();
            model.addAttribute("educationList",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 根据城市名查询
     * @param city_name
     * @param model
     * @return
     */
    @RequestMapping(value = "/selectEducationByCityName")
    public List<Education> selectEducationByCityName(String city_name, Model model){
        List<Education> resultList =null;
        try {
            resultList = educationService.selectEducationByCityName(city_name);
            model.addAttribute("resultList",resultList);
            System.out.println(city_name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList;
    }

    @RequestMapping(value = "/selectEducationByKeyword")
    public List<Education> selectEducationByKeyword(String keyword, Model model){
        List<Education> resultList1 = null;
        try {
            resultList1 = educationService.selectEducationByKeyword(keyword);
            model.addAttribute("resultList1",resultList1);
            System.out.println(keyword);
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultList1;
    }

}
