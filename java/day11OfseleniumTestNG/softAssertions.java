package day11OfseleniumTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertions {
	@Test
	public void testHF() {
		System.out.println("hello");
		Assert.assertEquals(10,12);
		Assert.assertEquals("abc", "abc");
		System.out.println("hi");

	}
	@Test
	public void testSF() {
		System.out.println("hello");
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(10,12);
		sf.assertEquals("abc", "abcY");
		System.out.println("hi");
		sf.assertAll();

	}
}

