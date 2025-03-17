package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myfeature2 {

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		System.out.println("the user is on the logi page");
		
	}
	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String string, String string2) {
		System.out.println("the user enter the user name as "+"user1");
		System.out.println("the user enter the password as "+"pass1");
		System.out.println("the user enter the user name as "+"user2");
		System.out.println("the user enter the password as "+"pass2");
	}
	@Then("the user should {string}")
	public void the_user_should(String string) {
		System.out.println("the user login successful");
		System.out.println("the user login successful");
	}

}
