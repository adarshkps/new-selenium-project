package day12OfSeleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OtherAttributes {
	@Test
	public void Login()
	{
		System.out.println("this is login test");
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods="Login")
	public void Logout()
	{
		System.out.println("this is log out test");
	}

}
