package com.spring.security.springsecurity.services;

import org.springframework.security.core.Authentication;

public interface UserService {
    Authentication signIn(String username, String password);
}
