package day8OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		WebElement ele = driver.findElement(By.id("username"));

		// normally we use sendKeys to send the values in to the webElement but in Java
		// script we use another way to to send the keys into the webElement

		// javaSctipt ele.value='adarsh'

		// 1.sendKeys
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='adarsh'", ele);
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));

		// highlight a webElement

		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", login);
		Thread.sleep(3000);

		// 2. click on a button

		js.executeScript("arguments[0].click();", login);
		
		 //3. scroll a web page
		
		js.executeScript("window.scrollTo(0,700)");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
