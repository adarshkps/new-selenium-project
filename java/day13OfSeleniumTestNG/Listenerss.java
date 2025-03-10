package day13OfSeleniumTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Listenerss extends Base {
	
	@Test(retryAnalyzer=myListener2.class)
	public void mytest1()
	{
//		int a;
//		System.out.println("this is test1");
//		Scanner sc=new Scanner(System.in);
//		a=sc.nextInt();
//		Assert.assertEquals(a, 5);
//	}
//	public void runThisWhenTestisFailed()
//	{
//		System.out.println("test got failed");
//	}
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(false);	
		
		
		
		
	
	}
}
