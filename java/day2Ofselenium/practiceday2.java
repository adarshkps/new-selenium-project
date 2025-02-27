package day2Ofselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceday2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// to search a web Element
		// Web element is an interface

		WebElement ele = driver.findElement(By.id("email"));
		// action we are providing
		// when we want to pass some values we use the send keys
		ele.sendKeys("adarshkp@gmail.com");
		Thread.sleep(3000);
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("hgehr23334");
		Thread.sleep(3000);
		WebElement log = driver.findElement(By.name("login"));
		log.click();

	}

}
