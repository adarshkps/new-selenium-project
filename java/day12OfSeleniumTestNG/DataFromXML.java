package day12OfSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataFromXML {
	
	@Test
	@Parameters(value="browser")
	public void test1(String browser) 
	{
		WebDriver driver=null;
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(driver.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		driver.get("https://www.facebook.com");
		
		
	}

}
