package com.qa.listeners_extentreports.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.listeners_extentreports.utils.ElementUtil;

public class SelectPage 
{
	private static Logger logger = LogManager.getLogger(InputPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;
	
	
	
	
		
	// **********************************SELECT WEBELEMENT UI LOCATORS *************************
		private By practiceUI = By.xpath("//button[@routerlink='/test']");
		private By selectUI = By.xpath("//p[text()='Select']//following::button[1]");
		private By selectAll = By.xpath(".//*[@id='superheros']");		
		private By selectValue = By.xpath(".//*[@id='country']");
		
		public SelectPage(WebDriver driver) 
		{
			
			
			this.driver = driver;
			elementUtil = new ElementUtil(driver);
		}

		// **********************************SELECT UI OPERATIONS *************************
				/**
				 * @author DESHAN
				 * in below method created for select UI WebElements 
				 *  methodName is "selectUI"
				 */
			public void selectUI()
			{
				elementUtil.doClick(practiceUI);
				elementUtil.doClick(selectUI);
				logger.info("******successfully user click Select Automation*******");
				elementUtil.doSelectByVisibleText(selectAll, "Ant-Man");
				logger.info("user select the drop down value is Ant-Man");
				elementUtil.doSelectByVisibleText(selectAll, "Batman");
				logger.info("user select the drop down value is BatMan");
				elementUtil.doSelectByTextOption(selectValue, "India");
				logger.info("user select the drop down value is India");
				elementUtil.navigationBack();
			}

}
