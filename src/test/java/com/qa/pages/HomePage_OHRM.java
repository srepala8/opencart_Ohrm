package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_OHRM extends BasePage{

	public HomePage_OHRM(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement dashboard;
	
	public String getDashboardText()
	{
		try {
		return(dashboard.getText());
	} catch (Exception e) {
		return(e.getMessage());
	}
	}
	
	public String getHomePageTitle()
	{
		try
		{
			return(driver.getTitle());
			
		}catch (Exception e) {
			return(e.getMessage());
		}
	}

}
