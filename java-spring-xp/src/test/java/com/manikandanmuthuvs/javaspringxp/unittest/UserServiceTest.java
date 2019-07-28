package com.manikandanmuthuvs.javaspringxp.unittest;

import static org.junit.Assert.assertEquals;

import com.manikandanmuthuvs.javaspringxp.JavaSpringXpApplication;
import com.manikandanmuthuvs.javaspringxp.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = JavaSpringXpApplication.class)
@ContextConfiguration
public class UserServiceTest {
    
    @Autowired
    private UserService userService;

    @Test
    public void userFirstNameWhenUserCodeDivisibleByThree() {
        Integer usernameCode = 3;
        assertEquals("Fizz", userService.UserName(usernameCode));
    }
    public void userLastNameWhenUserCodeDivisibleByFive() {
        Integer usernameCode = 5;
        assertEquals("Buzz", userService.UserName(usernameCode));
    }
}
