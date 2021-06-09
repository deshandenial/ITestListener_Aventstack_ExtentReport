package com.qa.listeners_extentreports.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Method;




import com.qa.listeners_extentreports.base.BaseTest;

public class FramePage_Test extends BaseTest 
{
	
	private static Logger logger = LogManager.getLogger(FramePage_Test.class);
	
	
	
  @Test
  public void frameUI(Method method) 
  {
	  
	  logger.info("*****frameTest is started******");
	
	  uiPage5.frameUI();
	  logger.info("*****frameTest is started******");
  }
}
