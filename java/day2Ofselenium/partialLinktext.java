package day2Ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinktext {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	//	WebElement cr=driver.findElement(By.partialLinkText("Create n"));
	//	cr.click();
		
		
	//finding the element using class name
		WebElement c=driver.findElement(By.className("_8esh"));
		c.click();
		
	
		
		
	}

}
