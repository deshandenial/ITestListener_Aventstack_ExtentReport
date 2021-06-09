package com.qa.listeners_extentreports.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.listeners_extentreports.utils.ElementUtil;

public class ButtonPage 
{

	private static Logger logger = LogManager.getLogger(InputPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;
	 
	
	// **********************************BUTTON WEBELEMENT UI LOCATORS *************************
	
		private By practiceUI = By.xpath("//button[@routerlink='/test']");
		private By buttonUI = By.xpath("//p[text()='Button']//following::button[1]");
		private By buttonClick = By.xpath(".//*[@id='home']");
		private By buttonDisableUI = By.xpath(".//*[@id='isDisabled']");
		
		public ButtonPage(WebDriver driver) 
		{
			
			
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
		}

	public void buttonUI()
	{
	elementUtil.doClick(practiceUI);
	elementUtil.doClick(buttonUI);
	logger.info("******successfully user Button Automation practice button*******");
	elementUtil.doClick1(buttonClick);
	logger.info("******successfully user GotoHome button*******");
	elementUtil.navigationBack();
	elementUtil.doClick1(buttonDisableUI);
	logger.info("******user try to click disable button*******");
	elementUtil.navigationBack();
	
	}



}
