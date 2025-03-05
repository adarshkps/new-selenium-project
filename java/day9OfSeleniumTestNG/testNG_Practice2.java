package day9OfSeleniumTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_Practice2 {

	@BeforeMethod
	public void setUp()
	{
		System.out.println("BeforeMethod");
	}
	@Test	(priority = 6)		
	public void CreateNewAccount()
	{
		System.out.println("Create a New Account");
	}
	@Test(priority = 5)
	public void Login()
	{
		System.out.println("login to the page");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("close the web page");
	}
}
