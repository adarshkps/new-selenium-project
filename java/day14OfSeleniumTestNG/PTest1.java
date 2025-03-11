package day14OfSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PTest1 {
	@Test
	public void test1()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//	
//		String str=driver.getTitle();
//		System.out.println(str);
//		Assert.assertEquals("Facebook – log in or sign up",str );
//		driver.close();
		System.out.println("this is test1 in class1");
	}

	@Test
	public void test2()
	{
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		String str=driver.getTitle();
//		System.out.println(str);
//		Assert.assertEquals("Facebook – log in or sign up",str );
//		driver.close();
		System.out.println("this is test1 class1");
	}
	@Test(enabled=false)
	public void test3()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String str=driver.getTitle();
		System.out.println(str);
		Assert.assertEquals("Facebook – log in or sign up",str );
		driver.close();
	}
	@Test(enabled=false)
	public void test4()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String str=driver.getTitle();
		System.out.println(str);
		Assert.assertEquals("Facebook – log in or sign up",str );
		driver.close();
	}



}
