package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RegistrationPage  extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement Lname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Psw;
	
	@FindBy(xpath="//h1[normalize-space()='Register Account']")
	WebElement msg;
	//Action Methods
	@FindBy(xpath="//input[@name='agree']")
	WebElement chekedpolicy;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement continuebtn;
	
	
	public void setFName(String name)
	{
		Fname.sendKeys(name);
	}
	
	public void setLname(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		Psw.sendKeys(password);
	}
	public void checkPolicy()
	{
		chekedpolicy.click();
	}
	public void clickOnContinue()
	{
		continuebtn.click();
	}
	public String getConfirmMsg()
	{
		try {
			return(msg.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
		
		
		
		
	}
	

}
