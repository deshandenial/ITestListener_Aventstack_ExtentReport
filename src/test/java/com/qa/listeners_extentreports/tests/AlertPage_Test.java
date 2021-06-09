package com.qa.listeners_extentreports.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import java.lang.reflect.Method;




import com.qa.listeners_extentreports.base.BaseTest;

public class AlertPage_Test extends BaseTest
{
	
	private static Logger logger = LogManager.getLogger(AlertPage_Test.class);
	
	
	
  @Test
  public void alertUI(Method method)
  {
	  
	  logger.info("*****alertTest is started******");
	 
	  uiPage4.alertUI();
	  logger.info("*****alertTest is started******");
  }
}
