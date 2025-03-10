 package day13OfSeleniumTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListener extends Base implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		//when test is getting passed
		System.out.println("############test got passed#############");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//when test is getting failed
		System.out.println("############test got failed#############");
		takeSS();
	}

	@Override
	public void onStart(ITestContext context) {
		//when test started
		System.out.println("############test started#############");
	}
	public void takeSS()
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File ss=tk.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ss,new File("./myscreenShot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
