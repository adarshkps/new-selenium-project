package day3OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement ele=	driver.findElement(By.xpath("//input[@data-testid='royal-email']"));
	ele.sendKeys("adbse@gmail..com");
	WebElement ele2=driver.findElement(By.xpath("//input[@type='password']"));
	ele2.sendKeys("923984hwetio");
//	WebElement ele3=driver.findElement(By.xpath("//button[text()='Log in']"));
//	ele3.click();
	WebElement ele4=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	ele4.click();
	
	
	
	
	
	}

}
