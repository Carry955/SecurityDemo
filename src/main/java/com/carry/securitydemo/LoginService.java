package com.carry.securitydemo;

import org.apache.coyote.Response;

public interface LoginService {
    ResponseResult login(User user);
}
