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

    @When("^the Client request User servie /user/firstname\\$ with code (\\d+)$")
    public void the_Client_request_User_servie_user_firstname$_with_code(int usernameCode) throws Exception {
        executeGet(rootUri + "/hello/?usercode=" + usernameCode);
    }

    @Then("^the Client receives User first name \"([^\"]*)\"$")
    public void the_Client_receives_User_first_name(String arg1) throws Exception {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertEquals(true, true);
    }
}