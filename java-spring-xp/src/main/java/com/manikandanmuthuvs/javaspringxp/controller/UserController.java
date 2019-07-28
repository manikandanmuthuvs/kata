package com.manikandanmuthuvs.javaspringxp.controller;

import com.manikandanmuthuvs.javaspringxp.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    
    private UserService userService;

    @GetMapping("/user/firstname/")
    public String GetFirstName(HttpServletResponse response) {
        return userService.FirstName();
    }

}