package day14OfSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice_Test {
	
	WebDriver driver;
	@Test
	public void login_test()
	{
		driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/register");
		Practice_PAGE lg=new Practice_PAGE(driver);
		lg.Enterusername();
		lg.Enterpassword();
		lg.EnterConfirmPassword();
		lg.clickReg();
	}

}
