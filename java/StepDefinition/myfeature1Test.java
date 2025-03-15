package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class myfeature1Test {
	WebDriver driver;
	@Given("open the chrome")
	public void open_the_chrome() {
		driver=new ChromeDriver();
	}
	@Given("user enter the url")
	public void user_enter_the_url() {
		driver.get("https://practice.expandtesting.com/login");
		}
	@When("user enter the username {string}")
	public void user_enter_the_username(String string1) {
		driver.findElement(By.id("username")).sendKeys(string1);
	}
	@When("user enter the password {string}")
	public void user_enter_the_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@When("user click on the login button")
	public void Login()
	{
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	@Then ("user will navigate to the same page")
	public void user_will_navigate_to_same_page() {
		WebElement ele=driver.findElement(By.xpath("//div[@id='flash']/b"));
	}
}
