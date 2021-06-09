package com.qa.listeners_extentreports.factory;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{



   
	private static Logger logger = LogManager.getLogger(DriverFactory.class);

	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser)
	{
		logger.info("application map with browser name is : " +browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			logger.info("******chrome browser triggered successfully******");
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
			logger.info("******chrome browser successfully launched******");
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			logger.info("******firefox browser triggered successfully******");
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
			logger.info("******firefox browser successfully launched******");
		}
		else
		{
			System.out.println("Please pass correct browser value: " + browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		logger.info("******chrome browser window successfully maximized******");
		//getDriver().get(prop.getProperty("url").trim());
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return getDriver();
	}
	
	public synchronized WebDriver getDriver()
	{
		return tldriver.get();
	}
	
	public String getScreenshot() {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		// File srcFile = new File(src);

		String path = System.getProperty("user.dir") + "/screenshots/"+ System.currentTimeMillis() + ".png";
		File destination = new File(path);

		try {
			FileUtils.copyFile(srcFile, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;

	}
			


}
