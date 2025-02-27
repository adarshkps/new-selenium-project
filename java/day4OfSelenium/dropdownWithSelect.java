package day4OfSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownWithSelect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		WebElement cdrop = driver.findElement(By.xpath("//select[@id='country']"));

		// dropdown -----> select
		Select sel = new Select(cdrop); // we should create the select class object when the drop down is in the form of
										// select tag
		// sel.selectByIndex(2);
		// sel.selectByVisibleText("India");
		// sel.selectByValue("AT");

		List<WebElement> we = sel.getOptions(); // to store the sel.getOptions in web element

		for (int i = 0; i < we.size(); i++) { // if we want top n number of values we can write the code like i<10;
			WebElement ele = we.get(i);
			if (ele.getText().equals("India")) // to know the country is available or not
			{
				System.out.println("india is there");
			}
			if (ele.getText().startsWith("A")) // to get the country names
			{
				System.out.println(ele.getText());
			}
		}

	}

}
