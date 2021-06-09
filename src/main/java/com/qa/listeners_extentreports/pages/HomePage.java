package com.qa.listeners_extentreports.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.listeners_extentreports.utils.ElementUtil;

public class HomePage 
{
	private static Logger logger = LogManager.getLogger(LoginPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;	
	
	
	private By practiceUI = By.xpath("//button[@routerlink='/test']");
	
	public HomePage(WebDriver driver) {
		
		
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	
	 public List<Object> doPractice() 
	  { 
		 
		 elementUtil.doClick(practiceUI);
		 List<Object> obj = new ArrayList<>();
		 obj.add(new InputPage(driver));
		 obj.add(new ButtonPage(driver));
		 obj.add(new SelectPage(driver));
		 obj.add(new AlertPage(driver));
		 obj.add(new FramePage(driver));
		    
		 return obj;
		
		  
	  }
	 
	 


}
