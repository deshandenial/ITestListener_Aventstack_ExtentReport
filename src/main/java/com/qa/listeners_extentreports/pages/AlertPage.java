package com.qa.listeners_extentreports.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.listeners_extentreports.utils.ElementUtil;

public class AlertPage 
{
	private static Logger logger = LogManager.getLogger(InputPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;
	

	// **********************************ALERT WEBELEMENT UI LOCATORS *************************
		private By practiceUI = By.xpath("//button[@routerlink='/test']");
		private By alertUI = By.xpath("//p[text()='Alert']//following::button[1]");
		private By simpleAlert = By.xpath(".//*[@id='accept']");	
		private By confirmationAlert = By.xpath(".//*[@id='confirm']");
		private By promptAlert = By.xpath(".//*[@id='prompt']");
		//private By validatePrompt = By.xpath(".//*[@id='myName']");
		private By modernAlert = By.xpath(".//*[@id='modern']");		
		private By gettextModernAlert = By.xpath(".//p[contains(text(),'Modern Alert - Some people address me as sweet alert as well ')]");
		private By closeModernAlert = By.xpath(".//*[@aria-label='close']");
		
		public AlertPage(WebDriver driver) 
		{
			
			
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
		}

		// **********************************ALERT UI OPERATIONS *************************
					/**
					 * @author DESHAN
					 * in below method created for alert UI WebElements 
					 *  methodName is "alertUI"
					 */
			public void alertUI()
			{
				
				// simple alert
				elementUtil.doClick(practiceUI);
				elementUtil.doClick(alertUI);
				logger.info("******successfully user click Alert Automation*******");
				elementUtil.doClick(simpleAlert);
				logger.info("******successfully user click simpleAlert button*******");
				elementUtil.waitForAlertPresent(10000);
				elementUtil.getAlertText(1000);
				
				
				// confirmation alert
				
				elementUtil.doClick(confirmationAlert);
				logger.info("******successfully user click Confirmation button*******");
				elementUtil.waitForAlertPresent(1000);
				elementUtil.getAlertText(1000);
				//elementUtil.dismissAlert(1000);
						
				// prompt alert
				elementUtil.doClick(promptAlert);
				logger.info("******successfully user click promptAlert button*******");
				elementUtil.waitForAlertPresent(1000);
				elementUtil.getAlertText(1000);
				
					
				// modern alert
				elementUtil.doClick(modernAlert);
				logger.info("******successfully user click Modern Alert button*******");
				elementUtil.getText(gettextModernAlert);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				elementUtil.doClick(closeModernAlert);
				logger.info("******successfully user close Modern alert*******");
				elementUtil.navigationBack();
			}
}
