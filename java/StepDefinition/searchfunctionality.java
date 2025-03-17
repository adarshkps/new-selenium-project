package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class searchfunctionality {
	WebDriver driver;
	@Given("user is able to open the browser")
	public void user_is_able_to_open_the_browser() {
		driver=new EdgeDriver();
	}
	@When("user enter the url as www.amazon.in\\/")
	public void user_enter_the_url_as_www_amazon_in() {
		driver.get("https://www.amazon.in/");
	}
	@When("user is able to search flowers")
	public void user_is_able_to_search_flowers() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("flowers");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@When("user close the amazon")
	public void user_close_the_amazon() {
		driver.close();
	}
}
