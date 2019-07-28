package com.manikandanmuthuvs.javaspringxp.integrationtest;

import com.manikandanmuthuvs.javaspringxp.integrationtestrunner.SpringIntegrationTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.springframework.http.HttpStatus;
import static org.junit.Assert.assertEquals;

public class UserServiceIT extends SpringIntegrationTest {
    
    private String rootUri = "http://localhost:8081";
    
        
    @Given("^the User has full name \"([^\"]*)\"$")
    public void the_User_has_full_name(String arg1) throws Exception {
    }

    @When("^the Client request User servie /user\\$ with username code divisible by (\\d+)$")
    public void the_Client_request_User_servie_user$_with_username_code_divisible_by(int usernameCode) throws Exception {
        executeGet(rootUri + "/user/?usernameCode=" + usernameCode);
    }

    @Then("^the Client receives User first name \"([^\"]*)\"$")
    public void the_Client_receives_User_first_name(String firstName) throws Exception {
        assertEquals(firstName, latestResponse.getBody());
   }  
}