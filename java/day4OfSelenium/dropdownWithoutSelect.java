package day4OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownWithoutSelect {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement ele=driver.findElement(By.xpath("//a[@role='button']"));
		ele.click();
//		WebElement ele2=driver.findElement(By.xpath("//a[text()='Examples']"));
//		ele2.click();
		WebElement ele3=driver.findElement(By.xpath("//a[text()='APIs']"));
		ele3.click(); 

	}

}
