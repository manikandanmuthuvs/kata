package com.manikandanmuthuvs.javaspringxp.integrationtestrunner;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class CucumberIntegrationTest extends SpringIntegrationTest{

}
