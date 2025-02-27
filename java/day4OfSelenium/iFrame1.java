package day4OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		WebElement ele=driver.findElement(By.xpath("//body[@id='tinymce']/child::p"));
		ele.sendKeys("this is new text");
		driver.switchTo().defaultContent();
		WebElement ele2=driver.findElement(By.xpath(" //a[text()='Automation Training']"));
		ele2.click();
		
		
		
		
	}

}
