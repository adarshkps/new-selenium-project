package day2Ofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findAllThelinks {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// to find the all the links 
	List<WebElement> ele= driver.findElements(By.tagName("a"));
	int tLinks=ele.size();
	if(tLinks==48)
	{
		System.out.println("test passed");
	}
	else
	{
		System.out.println("test failed");
	}
	
		
	
	
	
	}

}
