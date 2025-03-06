package day10OfSeleniumTestNG;

import org.testng.annotations.Test;

public class class2 {
	//smoke test
	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("this is test 1 class2");                                     
	}
	
	//regression test
	@Test(groups="reg",invocationTimeOut=1000)
	public void test2()
	{
		System.out.println("this is test 2 class2");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//work in progress
	@Test(groups="wip")
	public void test3()
	{
		System.out.println("this is test 3 class2");
	}
	
	//regression test
	@Test(groups="reg")
	public void test4()
	{
		System.out.println("this is test 4 class2");
	}
}
