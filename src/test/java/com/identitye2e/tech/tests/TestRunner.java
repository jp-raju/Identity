package com.identitye2e.tech.tests;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/main/resources/features/Check_Vehicle_Details.feature"},
		glue= {"com.identitye2e.tech.test.automation.stepDefinition"},
		plugin={"html:target/selenium-reports"}
		)
public class TestRunner  {

}
