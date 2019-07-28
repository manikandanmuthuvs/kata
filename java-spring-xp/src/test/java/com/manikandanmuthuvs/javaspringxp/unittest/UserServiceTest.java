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
    public void userFirstNameWhenUserCodeIsZero() {
        Integer usernameCode = 0;
        assertEquals("0", userService.FirstName(usernameCode));
    }
    public void userFirstNameWhenUserCodeIsOne() {
        Integer usernameCode = 1;
        assertEquals("1", userService.FirstName(usernameCode));
    }
    public void userFirstNameWhenUserCodeIsTwo() {
        Integer usernameCode = 2;
        assertEquals("1", userService.FirstName(usernameCode));
    }
}
