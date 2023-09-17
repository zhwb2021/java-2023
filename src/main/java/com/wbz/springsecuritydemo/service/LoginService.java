package com.wbz.springsecuritydemo.service;

import com.wbz.springsecuritydemo.entity.User;
import com.wbz.springsecuritydemo.utils.ResponseResult;

public interface LoginService {

    ResponseResult login(User user);
}
