package day3OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
		ele1.sendKeys("iphone 16");
		WebElement ele2=driver.findElement(By.xpath("//input[@type='submit']"));
		ele2.click();
	}

}
