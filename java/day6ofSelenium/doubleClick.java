package day6ofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.switchTo().frame("iframeResult");
		WebElement ele=driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
		act.doubleClick(ele).build().perform();
	
	
	
	
	
	}

}
