package com.qa.listeners_extentreports.tests;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.qa.listeners_extentreports.base.BaseTest;



public class HomePage_Test extends BaseTest
{
	
private static Logger logger = LogManager.getLogger(LoginPage_Test.class);
	

	
	
	@Test(priority = 1)
	public void homePageTest(Method method) 
	{
		
		
		logger.info("*****loginTest is started******");
		homePage.doPractice();
		logger.info("******loginTest is ended*******");
		
	}
	

}
