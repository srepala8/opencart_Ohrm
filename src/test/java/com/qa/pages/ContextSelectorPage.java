package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContextSelectorPage extends BasePage {

	public ContextSelectorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement selector;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement logoutbtn;
	
	public void clickSelector()
	{
		selector.click();
	}
	
	
	
	public void clickonLogout()
	{
		logoutbtn.click();
	}
}
