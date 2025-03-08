package day11OfseleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1 {
	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); // it will be failed because of actual and expected output is not matched
												// if there is facebook URL it will be passed
		String actual = driver.getTitle();
		System.out.println(actual);
		String exp = "Facebook – log in or sign up";

		// hard assertion
		Assert.assertEquals(actual, exp);
	}

	@Test
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement val = driver.findElement(By.xpath("//div[@id='flash']/b"));
		String str = val.getText();
		System.out.println(str);
		Assert.assertEquals(str, "You logged into a secure area!");
	}

	@Test
	public void test3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys("practicex");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPasswords!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement val = driver.findElement(By.xpath("//div[@id='flash']/b"));
		String str = val.getText();
		System.out.println(str);
		Assert.assertEquals(str, "Your username is invalid!");
	}

	@Test
	public void test4() {
		Assert.assertEquals(true, false); // --> this will be failed
		Assert.assertEquals(true, true); // -->this will be executed because the values are matching we can pass any
											// datatype in this field
		Assert.assertEquals(1, 1);
		Assert.assertEquals("this", "this");
	}

	@Test
	public void test5() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		WebElement val = driver.findElement(By.xpath("//div[@id='flash']/b"));
		String str = val.getText();
		boolean b = str.contains("secure area!");
		Assert.assertTrue(b);
		// Assert.assertEquals(b, true);

	}
}
