package com.nenujoin.demo.controller;

import com.nenujoin.demo.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Resource
    UserService userService;

    @ResponseBody
    @RequestMapping("/listAll")
    public List getAllUsers(HttpServletResponse resp) throws IOException {
        System.out.println("success");
        System.out.println(userService);
        System.out.println(userService.getAllUsers());
//        resp.setContentType("text/html;charset=utf-8");//设置编码格式，以防前端页面出现中文乱码
//        PrintWriter printWriter = resp.getWriter();//创建输出流
//        printWriter.println(userService.getAllUsers());
        return userService.getAllUsers();
    }

    @RequestMapping("/viewRcvTest")
    public String viewRcv(){
        return "viewresolvertest";
    }
}
