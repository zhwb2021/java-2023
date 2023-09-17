package com.wbz.springsecuritydemo.service.impl;

import com.wbz.springsecuritydemo.entity.User;
import com.wbz.springsecuritydemo.service.LoginService;
import com.wbz.springsecuritydemo.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginServiceimpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public ResponseResult login(User user) {
        //AuthenticationManager authenticate user
         UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                 new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());

        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        //if fail , response properly

        if(Objects.isNull(authenticate))
            throw new RuntimeException("Login Failed");

        //if success,  generate an jwt with userId , jwt saved into ResponseBody and return

        //save user info into redis , userId as key
        return null;
    }
}
