package day4OfSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/js-dialogs");
		WebElement ele2 = driver.findElement(By.xpath("//button[@id='js-prompt']"));
		ele2.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert(); // to create the alert
		Thread.sleep(2000);
		alert.sendKeys("java selenium"); // to send the keys in to the alert
		System.out.println(alert.getText()); // to get the text
		alert.accept();

	}

}
