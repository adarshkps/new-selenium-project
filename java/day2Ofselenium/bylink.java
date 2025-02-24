package day2Ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bylink {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//the link text will be work only for the anchor tags
		WebElement create=driver.findElement(By.linkText("Create new account"));
		create.click();
		
	}

}
