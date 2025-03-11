package day14OfSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice_PAGE {
	
	@FindBy(xpath="//input[@id='username']")
	WebElement user;
	public void Enterusername()
	{
		user.sendKeys("practice");
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	public void Enterpassword()
	{
		pass.sendKeys("adhi1234");
	}
	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement cpass;
	public void EnterConfirmPassword()
	{
		cpass.sendKeys("adhi1234");
	}
	@FindBy(xpath="//button[text()='Register']")
	WebElement reg;
	public void clickReg()
	{
		reg.click();
	}
	@FindBy(xpath="//div[@id='flash']/b")
	public WebElement as;
	
	Practice_PAGE(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
