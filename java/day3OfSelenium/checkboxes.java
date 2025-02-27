package day3OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/checkboxes");
		WebElement c1=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		System.out.println(c1.isSelected());
		c1.click();
		System.out.println(c1.isSelected());
		boolean b=c1.isSelected();
		if(b!=true)
		{
			c1.isSelected();

		}
//if it is unchecked it will be checked and if it is checked it will be unchecked
		
		
	}

}
