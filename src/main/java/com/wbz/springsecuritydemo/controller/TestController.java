package com.wbz.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

//    @GetMapping("/test")
//    public List<SysUser> list(){
//
//        return List.of(new SysUser(1, "zhangsan"), new SysUser(2, "lisi"));
//
//    }

    @GetMapping("/hello")
    public String sayHello(){

        return  "Hello Springboot Security!";

    }


}
