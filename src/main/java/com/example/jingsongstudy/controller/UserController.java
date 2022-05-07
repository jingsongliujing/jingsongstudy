package com.example.jingsongstudy.controller;

import com.example.jingsongstudy.bean.Result;
import com.example.jingsongstudy.bean.User;
import com.example.jingsongstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }

    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/user/login")
    public Result login(User user){
        return userService.login(user);
    }


    @PostMapping(value = "/login")
    public String login(){
        return "/index";
    }

}

