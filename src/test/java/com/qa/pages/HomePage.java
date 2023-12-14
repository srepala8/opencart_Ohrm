package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement linkMyaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement linkRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement linklogin;
	
	
	//Action Methods
	
	public void clickMyaccount()
	{
		linkMyaccount.click();
	}
	public void clickonRegister()
	{
		linkRegister.click();
	}
	
	public void clickOnLogin()
	{
		linklogin.click();
	}
}
