
/*
package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.RegistrationPage;

public class TC_001_AccountRegistrationTest extends TestBase {
	
	
	
	
	
	@Test
	void test_account_registration()
	{
		
		logger.debug("application logs......");
		logger.info("*  Starting TC_001_AccountRegistrationTest *");
		
		try {
		HomePage hpage= new HomePage(driver);
		hpage.clickMyaccount();
		logger.info("Clicked on My account link");
		hpage.clickonRegister();
		logger.info("Clicked on register link");
		RegistrationPage regpage=new RegistrationPage(driver);
		logger.info("Providing customer data");
		regpage.setFName(randomeString());
		regpage.setLname(randomeString());
		regpage.setEmail(randomeString()+"@gmail.com"); //randomly generated
		regpage.setpassword("test@$");
		//regpage.checkPolicy();
		//logger.info("Clicked on continue");
		//regpage.clickOnContinue();
		logger.info("Validating expected message");
		String confirmMsg=regpage.getConfirmMsg();
		System.out.println(confirmMsg);
		
		Assert.assertEquals(confirmMsg, "Register Account");
	
	}
	catch(Exception e)
	{
		logger.error("test failed");
		Assert.fail();
	}
		logger.info("*  Finished TC_001_AccountRegistrationTest *");
	}
}*/
