package com.manikandanmuthuvs.javaspringxp.service;

public class UserServiceImpl implements UserService {

    public String UserName(Integer usernameCode) {
        if (usernameCode == 0)
            return "0";
        if (usernameCode % 3 == 0)
            return "Fizz";
        if (usernameCode % 5 == 0)
            return "Buzz";
        if (usernameCode % 3 == 0 && usernameCode % 5 == 0)
            return "Fizz Buzz";
        return "Error";
    }

}