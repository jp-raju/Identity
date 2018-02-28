package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"resources/features/Check_Vehicle_Details.feature"},
		glue= {"stepDefinition"},
		plugin={"html:target/selenium-reports"}
		)
public class TestRunner  {

}
