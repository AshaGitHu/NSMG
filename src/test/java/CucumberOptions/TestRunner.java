package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features//Login.feature",
		glue = "StepDefinition", stepNotifications = true,
		monochrome = true , 
		publish = true
		
		)


public class TestRunner {

}
