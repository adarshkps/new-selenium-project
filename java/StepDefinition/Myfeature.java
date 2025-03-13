package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Myfeature {
	@Given("this is step1")
	public void this_is_step1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step1_-------------------");
	}

	@When("this is step2")
	public void this_is_step2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step2---------------------");
	}

	@Then("this is step3")
	public void this_is_step3() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is step3------------------");
	}

}
