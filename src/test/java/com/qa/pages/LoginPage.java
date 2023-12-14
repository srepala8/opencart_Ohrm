package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement UName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement PassWord;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	
	//Action Methods
	
	public void setUserName(String Un)
	{
	     UName.sendKeys(Un);
	}
	public void setPassword(String pwd)
	{
		PassWord.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
	

}
