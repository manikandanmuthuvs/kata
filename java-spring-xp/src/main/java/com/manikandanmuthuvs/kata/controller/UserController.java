package com.manikandanmuthuvs.kata.controller;

import com.manikandanmuthuvs.kata.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    private UserService userService;

    @GetMapping("/user/")
    @ResponseBody
    public String GetUserName(@RequestParam Integer usernameCode) {
        return userService.UserName(usernameCode);
    }

}