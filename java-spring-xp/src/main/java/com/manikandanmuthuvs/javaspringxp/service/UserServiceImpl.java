package com.manikandanmuthuvs.javaspringxp.service;

public class UserServiceImpl implements UserService {
    
    public String UserName(Integer usernameCode) {
        if (usernameCode % 3 == 0) {
            return "Fizz";
        } 
        else if (usernameCode % 5 == 0) {
            return "Buzz";
        }
        else{
            return "Error";
        }
    }

}