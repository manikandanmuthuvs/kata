package com.manikandanmuthuvs.javaspringxp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserStepDefinition extends CucumberStepDefenition {

    @Autowired
    User user;

    @Given("^User has full name$")
    public void user_has_full_name() throws Exception {
        String expected = "Fizz";
        String actual = user.getFirstName();
        assertEquals("Jack",actual);
    }
}