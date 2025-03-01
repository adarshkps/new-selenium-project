package day6ofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNdrop {
	public void dragRedNGreenNBlue() {
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
		WebElement red = driver.findElement(By.xpath("//div[@class='red']"));
		WebElement green = driver.findElement(By.xpath("//div[@class='green']"));
		WebElement blue=driver.findElement(By.xpath("//div[@class='blue']"));
		WebElement bucket = driver.findElement(By.xpath("//div[@id='target']"));
		act.dragAndDrop(red, bucket).build().perform();
		act.dragAndDrop(green, bucket).build().perform();
		act.dragAndDrop(blue, bucket).build().perform();   
		
	}

//	public void dragGreen() {
//		WebDriver driver = new ChromeDriver();
//		Actions act = new Actions(driver);
//		driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
//		WebElement green = driver.findElement(By.xpath("//div[@class='green']"));
//		WebElement bucket = driver.findElement(By.xpath("//div[@id='target']"));
//		act.dragAndDrop(green, bucket).build().perform();
	

	public static void main(String[] args) {

//		WebElement blue=driver.findElement(By.xpath("//div[@class='blue']"));
//		act.dragAndDrop(blue, bucket).build().perform();
		DragNdrop obj1 = new DragNdrop();
		obj1.dragRedNGreenNBlue();
		

	}

}
