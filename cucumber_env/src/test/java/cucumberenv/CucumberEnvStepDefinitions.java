package cucumberenv;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberEnvStepDefinitions {

	@Given("^Test code are written$")
	public void give() throws Throwable {
	    System.out.println("Given");
	}

	@When("^Test the code$")
	public void when() throws Throwable {
		System.out.println("When");
	}

	@Then("^Tests should pass$")
	public void then() throws Throwable {
		System.out.println("Then");
	}
	
}
