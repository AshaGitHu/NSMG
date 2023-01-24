package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition {
	
	@Given("user is on landing page")
	public void user_is_on_landing_page()
	{
		System.out.println("landing page");
	}
	
	@When("user login into application with username and password")
	public void user_on_loginpage()
	{
		System.out.println("login successfully");
		
	}
	
	@Then("Home page is populated")
	public void Homepage_populated()
	{
		System.out.println("Home page populated");
		
	}
	
	@And("Articles are displayed")
    public void articles_are_displayed()
    {
		System.out.println("Articles are displayed");
		
    }

}
