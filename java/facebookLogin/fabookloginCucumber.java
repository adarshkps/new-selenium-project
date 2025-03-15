package facebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fabookloginCucumber {
	WebDriver driver;
	@Given("open the chrome")
	public void open_the_chrome() {
		driver=new ChromeDriver();
	}

	@Given("user enter the url")
	public void user_enter_the_url() {
		driver.get("https://www.facebook.com/");
	}

	@When("user enter the username {string}")
	public void user_enter_the_username(String username) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	}

	@When("user enter the password {string}")
	public void user_enter_the_password(String password) {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	}
	@And("user click on the login button")
	public void user_clicks_on_the_login_button()
	{
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("user will navigate to forgot password page")
	public void user_will_navigate_to_forgot_password_page() {
		WebElement fp=driver.findElement(By.xpath("//span[text()='Forgotten password?']"));
		String str=fp.getText();
		Assert.assertEquals(str, "Forgotten password?");
	}

}
