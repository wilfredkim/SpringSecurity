package com.spring.security.springsecurity.controllers;

import com.spring.security.springsecurity.payloads.LoginDto;
import com.spring.security.springsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signin")
    public Authentication login(@RequestBody LoginDto loginDto) {
        return userService.signIn(loginDto.getUsername(), loginDto.getPassword());
    }

}
