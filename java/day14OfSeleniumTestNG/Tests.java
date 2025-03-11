package day14OfSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
	
	@Test
	public void loginTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		Login lg=new Login(driver);
		lg.EnterUserName();
		lg.EnterPassword();
		lg.ClickLogin();
		String str=driver.getTitle();
		System.out.println(str);
		Assert.assertEquals("Secure Page page for Automation Testing Practice", str);
		
		
	}
	

}
