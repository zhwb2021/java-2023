package com.wbz.springsecuritydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
@MapperScan("com.wbz.springsecuritydemo.mapper")
public class SpringSecurityDemoApplication {

    public static void main(String[] args) {

         SpringApplication.run(SpringSecurityDemoApplication.class, args);
//        System.out.println(1111);
    }

}
