package com.qa.listeners_extentreports.tests;




import org.testng.annotations.Test;

import com.qa.listeners_extentreports.base.BaseTest;

import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputPage_Test extends BaseTest
{
	
	private static Logger logger = LogManager.getLogger(InputPage_Test.class);
	
	
	
	
	@Test(priority = 1)
	public void inputTest(Method method) 
	{
		
		 
		logger.info("*****inputTest is started******");
		uiPage.inputUI();
		logger.info("******inputTest is ended*******");
		
	}
	
	
	
	
}
