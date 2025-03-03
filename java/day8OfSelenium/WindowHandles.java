 package day8OfSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		//		System.out.println(cWind);
		
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String cwind=driver.getWindowHandle();
		
		Set <String> allwindows=driver.getWindowHandles();
		
		// get the data from set 
		
		//iterator ----> list()
		
		List<String> li=new ArrayList<>(allwindows);
		for(int i=0;i<li.size();i++)
		{
			String win=li.get(i);
			driver.switchTo().window(win);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		}
		driver.close();			//  it will close only the web page that is belongs to the web element
//		driver.quit();				it will will close window
		
		
		
		
		
		
		
		
		
		
	}

}
