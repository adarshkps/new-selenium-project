package day4OfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownpractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement ele= driver.findElement(By.xpath("//select[@id='elementsPerPageSelect']"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("100");
		Thread.sleep(2000);
		sel.selectByVisibleText("10");
		
		
		
		
		
	}

}
