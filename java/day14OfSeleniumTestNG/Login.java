package day14OfSeleniumTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath="//input[@id='username']")
	WebElement user;
	public void EnterUserName()
	{
		user.sendKeys("practice");
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement pass;
	public void EnterPassword()
	{
		pass.sendKeys("SuperSecretPassword!");
	}
	@FindBy(xpath="//button[text()='Login']")
	WebElement LoginBt;
	public void ClickLogin()
	{
		LoginBt.click();
	}
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
