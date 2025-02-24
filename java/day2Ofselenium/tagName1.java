package day2Ofselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//to search for multiple web elements
	List<WebElement> l1=driver.findElements(By.tagName("input"));
//	System.out.println(l1.get(0));
//	System.out.println(l1.size());
//	WebElement el=l1.get(0);
//	System.out.println(l1.get);
	for (int i=0;i<l1.size();i++)
	{
		WebElement ele=l1.get(i);
		System.out.println(((Object) l1));
	}
		
		
		
		
	}

}
