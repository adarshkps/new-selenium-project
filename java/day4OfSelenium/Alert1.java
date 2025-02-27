package day4OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		WebElement ele = driver.findElement(By.xpath("//button[@id='js-alert']"));
		ele.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
