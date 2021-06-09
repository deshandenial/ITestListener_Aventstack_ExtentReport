package com.qa.listeners_extentreports.base;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import com.qa.listeners_extentreports.factory.DriverFactory;
import com.qa.listeners_extentreports.pages.HomePage;
import com.qa.listeners_extentreports.pages.LoginPage;
import com.qa.listeners_extentreports.pages.InputPage;
import com.qa.listeners_extentreports.pages.ButtonPage;
import com.qa.listeners_extentreports.pages.SelectPage;
import com.qa.listeners_extentreports.pages.AlertPage;
import com.qa.listeners_extentreports.pages.FramePage;
import com.qa.listeners_extentreports.utils.ConfigReader;


public class BaseTest 
{
	private static Logger logger = LogManager.getLogger(BaseTest.class);
	public WebDriver driver;
	public Properties prop;
	DriverFactory df;
	private ConfigReader configReader;
	public LoginPage loginPage;
	public HomePage homePage;
	public InputPage uiPage;
	public ButtonPage uiPage2;
	public SelectPage uiPage3;
	public AlertPage uiPage4;
	public FramePage uiPage5;
	
	
	
	
	
	@BeforeTest
	public void setUp() 
	{
		logger.info("******before test annotation triggered******");
		configReader =new ConfigReader();
		prop = configReader.init_prop();
		String browser = prop.getProperty("browser");
		df = new DriverFactory();
		driver =df.init_driver(browser);
		logger.info("******successfully browser read properties files******");
		driver.get("https://letcode.in/");
		logger.info("******application url triggered******");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    loginPage = new LoginPage(driver);
	    logger.info("******before test annotation finished******");
	    
	}
	
	
	@AfterTest
	public void tearDown() 
	{
	logger.info("******after test annotation triggered******");
	 driver.quit();	
	 logger.info("******after test annotation completed******");
	}

	
	
	

}
