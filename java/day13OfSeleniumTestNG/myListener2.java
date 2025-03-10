package day13OfSeleniumTestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class myListener2 implements IRetryAnalyzer{

	int MaxTry=3;
	int count=0;
	@Override
	public boolean retry(ITestResult result) {
		if(count<MaxTry)
		{
			count++;
			return true;
		}
		
		return false;
	}
	
	

}
