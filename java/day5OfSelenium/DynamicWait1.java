


//				implicit wait			//

package day5OfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/login");
		WebElement ele=driver.findElement(By.xpath("//input[@id='username']"));
		ele.sendKeys("abc");
		WebElement ele2=driver.findElement(By.xpath("//input[@id='password']"));
		ele2.sendKeys("121212asas");
		WebElement ele3=driver.findElement(By.xpath("//button[@type='submit']"));
		ele3.click();
	//	WebElement ele4=driver.findElement(By.xpath("//button[@type='submitsdf']"));
	//	ele4.click();
	
		
	}

}
