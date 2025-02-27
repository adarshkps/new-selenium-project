package day3OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		WebElement r1=driver.findElement(By.xpath("//input[@id='red']"));
		r1.click();
		WebElement r2=driver.findElement(By.xpath("//input[@id='football']"));
		r2.click(); 
		
		
		
	}

}
