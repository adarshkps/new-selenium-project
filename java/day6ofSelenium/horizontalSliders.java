package day6ofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class horizontalSliders {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	Actions act=new Actions(driver);
	driver.get("https://practice.expandtesting.com/horizontal-slider");
	WebElement ele=driver.findElement(By.xpath("//input[@type='range']"));
	act.dragAndDropBy(ele,5,0).build().perform();
	
	
	
	//this is horizontal slider when we want to access the vertical slider then we have change the values like 
	//there is (ele,5,0) is there so we should change the values into (ele,0,5) then it will access the vertical slider
	
			
			
			
}
}
