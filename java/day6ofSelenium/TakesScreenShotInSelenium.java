package day6ofSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShotInSelenium {
public static void main(String[] args) throws IOException {
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	TakesScreenshot tk=(TakesScreenshot)driver;
	File file=tk.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("./myscreenshot.png"));
	
	
	
	
	
	
}
}
