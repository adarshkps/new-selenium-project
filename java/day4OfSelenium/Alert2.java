package day4OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		WebElement ele2 = driver.findElement(By.xpath("//button[@id='js-confirm']"));
		ele2.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

}
