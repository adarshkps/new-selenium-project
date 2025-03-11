package day14OfSeleniumTestNG;

import org.testng.annotations.Test;

public class PTest2 {
	@Test
	public void test1()
	{
		System.out.println("this is test1 class2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("this is test2 class2");
	}

	@Test(enabled=false)
	public void test3()
	{
		System.out.println("this is test3 class2");
	}

	@Test(enabled=false)
	public void test4()
	{
		System.out.println("this is test4 class2");
	}


}
