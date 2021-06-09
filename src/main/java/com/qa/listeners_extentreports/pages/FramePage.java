package com.qa.listeners_extentreports.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.listeners_extentreports.utils.ElementUtil;

public class FramePage 
{
	private static Logger logger = LogManager.getLogger(InputPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;
	
	
	
	
	
	// **********************************FRAME WEBELEMENT UI LOCATORS *************************
		private By practiceUI = By.xpath("//button[@routerlink='/test']");
		private By frameUI = By.xpath("//p[text()='Frame']//following::button[1]");
		private By firstFrame = By.xpath(".//*[@id='firstFr']");	
		private By firFrameName = By.xpath(".//*[@name='fname']");
		private By innerFrame = By.xpath(".//*[@src='innerFrame']");
		private By innFrameEmail = By.xpath(".//*[@name='email']");		
		private By firFrameLast = By.xpath(".//*[@name='lname']");
		private By getTextFrame = By.xpath(".//*[@class='title has-text-info']");
		
	
	
	public FramePage(WebDriver driver) {
			
			
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
		}
	public void frameUI()
	{
		elementUtil.doClick(practiceUI);
		elementUtil.doClick(frameUI);
		logger.info("******successfully user click Frames Automation*******");
		elementUtil.waitForFrameToBeAvailable(firstFrame, 1000);
		elementUtil.doSendKeys(firFrameName, "Deshan");
		logger.info("******successfully user send a text in parent frame to firstName field*******");
		elementUtil.waitForFrameToBeAvailable(innerFrame, 1000);
		elementUtil.doSendKeys(innFrameEmail, "Deshan@gmail.com");
		logger.info("******successfully user send a text in child frame to emailName field*******");
		elementUtil.parentFrame();
		elementUtil.doSendKeys(firFrameLast, "Denial");
		logger.info("******successfully user send a text in parent frame to lastName field*******");
		elementUtil.getText(getTextFrame);
		
	}

}
