package com.wbz.springsecuritydemo.controller;

import com.wbz.springsecuritydemo.entity.User;
import com.wbz.springsecuritydemo.service.LoginService;
import com.wbz.springsecuritydemo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {


    @Autowired
    private LoginService loginService;

    @GetMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        return  loginService.login(user);


    }
}
