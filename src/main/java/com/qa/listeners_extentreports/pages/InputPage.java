package com.qa.listeners_extentreports.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.qa.listeners_extentreports.utils.ElementUtil;





public class InputPage 
{
	private static Logger logger = LogManager.getLogger(InputPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;
	 
	private By Login = By.xpath("//a[@class='button is-info']");
	private By username = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[text()='LOGIN']");
	private By practiceUI = By.xpath("//button[@routerlink='/test']");
	
	// **********************************INPUT WEBELEMENT UI LOCATORS *************************
		
		private By inputUI = By.xpath("//p[text()='Input']//following::button[1]");
		private By clearUI = By.xpath(".//*[@id='clearMe']");
		private By getTextUI = By.xpath(".//*[@id='getMe']");
	
	
	public InputPage(WebDriver driver) {
			
			
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
		}

	
	
	// **********************************INPUT UI OPERATIONS *************************
	/**
	 * @author DESHAN
	 * in below method created for input UI WebElements 
	 *  methodName is "inputUI"
	 */
	
	public void inputUI()
	{
		
		logger.info("******successfully user click practice button*******");
		try
		{
		elementUtil.doClick(inputUI);
		logger.info("******successfully user Input Automation practice login button*******");
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		elementUtil.doSendKeys1(clearUI, "My Name is Deshan Denial");
		logger.info("user successfully send a text into clear the text input field");
		elementUtil.doGetElementText(getTextUI);
		logger.info("*****get the text from this field What is inside the text box******");
		elementUtil.navigationBack();
	}
	
	
			
	
}
