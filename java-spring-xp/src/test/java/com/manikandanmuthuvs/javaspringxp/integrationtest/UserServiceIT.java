package com.manikandanmuthuvs.javaspringxp.integrationtest;

import com.manikandanmuthuvs.javaspringxp.integrationtestrunner.SpringIntegrationTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.springframework.http.HttpStatus;
import static org.junit.Assert.assertEquals;

public class UserServiceIT extends SpringIntegrationTest {
    
    @Given("^the user has full name \"([^\"]*)\"$")
    public void the_user_has_full_name(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}