package day3OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Login']"));
		ele.click();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		ele2.sendKeys("8367768644");
		Thread.sleep(3000);
		WebElement ele3 = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		ele3.click();
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
		ele1.sendKeys("iphone16");

	}

}
