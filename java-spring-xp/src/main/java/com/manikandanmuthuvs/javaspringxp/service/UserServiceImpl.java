package com.manikandanmuthuvs.javaspringxp.service;

public class UserServiceImpl implements UserService {
    
    public String FirstName(Integer usernameCode) {
        if(usernameCode == 0){
            return "Fizz";
        }else{
            return "0";
        }
    }

}