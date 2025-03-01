package day6ofSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOverActions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // this is optional when the duration is not
																			// sufficient by the server
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		driver.switchTo().frame("iframeResult"); // when the element is in the iframe then we have to do this
		WebElement smiley = driver.findElement(By.xpath("//img[@onmouseover='bigImg(this)']"));
		act.moveToElement(smiley).build().perform();

	}

}
