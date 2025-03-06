package day10OfSeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceAnnotations {
	WebDriver driver;

	@BeforeMethod
	public void SetUP() {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/");
	}

	@Test
	public void clickonTestlogin() {
		driver.findElement(By.xpath("//a[text()='Test Login Page']")).click();
	}

	@Test
	public void webInputs() {
		driver.findElement(By.xpath("//a[text()='Web inputs']")).click();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
