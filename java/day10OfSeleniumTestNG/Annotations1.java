package day10OfSeleniumTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {

	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^before suite^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	@BeforeClass
	public void bfClass()
	{
		System.out.println("################### before class #############################");
	}
	@BeforeTest				// BeforeTest and AfterTest it will be executed only once # before once and after once
	public void bfTest()
	{
		System.out.println("before Test---------------->open chrome browser");
		//WebDriver driver=new ChromeDriver();
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("--------------------this is before method-------------------------");
	}
	@Test
	public void test1()
	{
		System.out.println("this is test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("this is test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("this is test 3");
	}
	@AfterMethod
	public void afMethod()
	{
		System.out.println("----------------------this is after method--------------");
	}
	@AfterTest
	public void afTest()
	{
		System.out.println("after test---------------->");
	}
	@AfterClass()
	public void afClass()
	{
		System.out.println("################### after class #############################");
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^before suite^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	
	
	
	
	
	
	
}
