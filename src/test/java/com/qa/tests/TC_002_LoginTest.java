package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContextSelectorPage;
import com.qa.pages.HomePage;
import com.qa.pages.HomePage_OHRM;
import com.qa.pages.LoginPage;
import com.qa.pages.MyAccountPage;



public class TC_002_LoginTest extends TestBase
{
	@Test
	public void test_Login()
	{
		//logger.info("Starting TC_002_LoginTest");
		
		try
		{				
			
			
			LoginPage lp=new LoginPage(driver);
			
			lp.setUserName(rb.getString("UserName")); // valid email, get it from properties file
			
			lp.setPassword(rb.getString("PassWord")); // valid password, get it from properties file
			
			lp.clickLogin();
			
			HomePage_OHRM hohrm=new HomePage_OHRM(driver);
			String exp_text=hohrm.getDashboardText();
			System.out.println(exp_text);
			
			Assert.assertEquals(exp_text,"Dashboard");
			
			//boolean targetpage=macc.isMyAccountPageExists();
						
			//Assert.assertEquals(targetpage, true);
			
			String exp_title=hohrm.getHomePageTitle();
			System.out.println(exp_title);
			Assert.assertEquals(exp_title,"OrangeHRM");
			
			ContextSelectorPage cs=new ContextSelectorPage(driver);
			cs.clickSelector();
			cs.clickonLogout();
			
		}	
		catch(Exception e)
		{
			Assert.fail();
		}
		//logger.info(" Finished TC_002_LoginTest");
		
	}
	
	
}
