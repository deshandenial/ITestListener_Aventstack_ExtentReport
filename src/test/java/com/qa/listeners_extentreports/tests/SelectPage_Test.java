package com.qa.listeners_extentreports.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import java.lang.reflect.Method;




import com.qa.listeners_extentreports.base.BaseTest;



public class SelectPage_Test extends BaseTest
{
	
	private static Logger logger = LogManager.getLogger(SelectPage_Test.class);
	
	
	
	
  @Test
  public void selectUI(Method method) 
  {
	
	  logger.info("*****selectTest is started******");
	 
	  uiPage3.selectUI();
	  logger.info("*****selectTest is ended******");
  }
}
