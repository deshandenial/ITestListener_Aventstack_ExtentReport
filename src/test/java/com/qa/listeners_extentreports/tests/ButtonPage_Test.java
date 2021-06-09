package com.qa.listeners_extentreports.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




import com.qa.listeners_extentreports.base.BaseTest;




public class ButtonPage_Test extends BaseTest
{
	
	
	Logger logger = LogManager.getLogger(ButtonPage_Test.class);
	
		
	@Test(priority = 2)
	public void buttonTest(Method method) 
	{
		
		
		logger.info("*****buttonTest is started******");	
		uiPage2.buttonUI();
		logger.info("******buttonTest is ended*******");
	}
	
}
