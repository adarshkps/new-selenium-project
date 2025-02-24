package day2Ofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class className {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/");
	List<WebElement> cls=driver.findElements(By.className("card-text"));
	System.out.println(cls.size());
	
	for (int i=0;i<cls.size();i++)
	{
		WebElement ele=cls.get(i);
		System.out.println(ele.getTagName());
		System.out.println(ele.getText());
	}
	
		
		
		
		
		
		
		
		
	}

}
