package day6ofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keypress {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://the-internet.herokuapp.com/key_presses");

		act.sendKeys(Keys.ENTER).build().perform(); // we can perform multiple actions using keypress from all the keys
														// in the keyboard
		
	}
}
