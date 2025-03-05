package day9OfSeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Practice {
	
	WebDriver driver;
	@BeforeMethod
	public void SetUP()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test (priority=1)
	public void Clicklogin()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("adarsh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}
	@Test (priority=0)
	public void CreateNewAccount()
	{
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
