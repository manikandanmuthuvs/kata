package com.manikandanmuthuvs.kata.cucumber.stepdefs;

import com.manikandanmuthuvs.kata.model.Cuboid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CuboidStepDefs {

  private StepDefsContext context = StepDefsContext.CONTEXT;

  @Given("^the length \"([^\"]*)\" width \"([^\"]*)\" and height \"([^\"]*)\" of Cuboid$")
  public void the_length_width_and_height_of_Cuboid(Integer length, Integer width, Integer height) throws Exception {
        Cuboid cuboid = Cuboid.builder()
        .length(length)
        .width(width)
        .height(height)
        .build();
        context.givenObject(cuboid);
  }

  @When("^user request to get the volume of Cuboid$")
  public void user_request_to_get_the_volume_of_Cuboid() throws Exception {
    
  }

  @Then("^user gets the volume of Cuboid$")
  public void user_gets_the_volume_of_Cuboid() throws Exception {
    // Write code here that turns the phrase above into concrete actions
    // throw new PendingException();
  }

}