package com.manikandanmuthuvs.kata.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
            "pretty",
            "html:target/cucumber",
            "json:target/cucumber/Cucumber.json",
            "junit:target/cucumber/Cucumber.xml",
    },
    features = {
            "features"
    },
    glue = {
        "com/manikandanmuthuvs/kata/cucumber/stepdefs",
        "com/manikandanmuthuvs/kata/cucumber/config"
    },
    tags = {
        "@Cuboid"
    }
)
public class RunCucumberTest {
}