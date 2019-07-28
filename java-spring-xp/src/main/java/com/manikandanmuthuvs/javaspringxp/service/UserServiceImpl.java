package com.manikandanmuthuvs.javaspringxp.service;

public class UserServiceImpl implements UserService {
    
    public String FirstName(Integer usernameCode) {
        if(usernameCode == 0){
            return "0";
        } else if (usernameCode == 1) {
            return "1";
        }
        else{
            return "Error";
        }
    }

}