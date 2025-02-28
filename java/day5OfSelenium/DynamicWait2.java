
			//		explicit wait		//

package day5OfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWait2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys("adhi");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='passabc']"))).sendKeys("dfasd");
//		WebElement ele2=driver.findElement(By.xpath("//input[@id='passabc']"));
//		ele2.sendKeys("12051205");
		WebElement ele3=driver.findElement(By.xpath("//button[text()='Log in']"));
		ele3.click();
//		WebElement ele=driver.findElement(By.xpath("//a[text()='Create new account']"));
//		ele.click();
//		WebElement ele2=driver.findElement(By.xpath("//input[@name='firstname']"));
//		ele2.sendKeys("adarsh");
//		WebElement ele3=driver.findElement(By.xpath("//input[@name='lastname']"));
//		ele3.sendKeys("kp");
//		WebElement ele4=driver.findElement(By.xpath("//select[@id='day']"));
//		Select sel=new Select(ele4);
//		sel.selectByValue("5");
//		WebElement ele5=driver.findElement(By.xpath("//select[@id='month']"));
//		Select sel2=new Select(ele5);
//		sel2.selectByIndex(5);
//		WebElement ele6=driver.findElement(By.xpath("//select[@id='year']"));
//		Select sel3=new Select(ele6);
//		sel3.selectByVisibleText("2001");
//		WebElement ele7=driver.findElement(By.xpath("//input[@value='2']"));
//		ele7.click();
//		WebElement ele8=driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		ele8.sendKeys("7428730894");
//		WebElement ele9=driver.findElement(By.xpath("//input[@type='password']"));
//		ele9.sendKeys("abc123");
//		WebElement ele10=driver.findElement(By.xpath("//button[@name='websubmit']"));
//		ele10.click();
		
		
		
		
	}

}
