package com.qa.listeners_extentreports.tests;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.qa.listeners_extentreports.base.BaseTest;
import com.qa.listeners_extentreports.pages.HomePage;


public class LoginPage_Test extends BaseTest
{

	//LoginPage loginPage = new LoginPage(driver);

private static Logger logger = LogManager.getLogger(LoginPage_Test.class);
	
	
	
	
	@Test(priority = 1)
	public void loginTest(Method method) 
	{
		
		
		logger.info("*****loginTest is started******");
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("******loginTest is ended*******");
		
		
	}
	
	
	

}
