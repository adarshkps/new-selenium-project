package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("Open the Chrome")
	public void open_the_chrome() {
		driver = new ChromeDriver();
	}

	@When("user enter the url https:\\/\\/practice.expandtesting.com\\/login")
	public void user_enter_the_url_https_practice_expandtesting_com_login() {
		driver.get("https://practice.expandtesting.com/login");
	}

	@When("user enter the username as practice")
	public void user_enter_the_username_as_practice() {
		driver.findElement(By.id("username")).sendKeys("practice");
	}

	@When("user enter the password as SuperSecretPassword!")
	public void user_enter_the_password_as_super_secret_password() {
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

	}

	@Then("user click on the login button")
	public void user_click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

	@Then("user will navigate to logout page")
	public void user_will_navigate_to_logout_page() {
		WebElement Logout = driver.findElement(By.xpath("//a[@class='button secondary radius btn btn-danger']/i"));
		String str = Logout.getText();
		Assert.assertEquals(str, "Logout");
	}

	@Then("user will close the browser")
	public void user_will_close_the_browser() {
		driver.close();
	}

}
