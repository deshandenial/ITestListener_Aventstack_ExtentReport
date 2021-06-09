package com.qa.listeners_extentreports.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.listeners_extentreports.utils.ElementUtil;

public class LoginPage 
{
	private static Logger logger = LogManager.getLogger(LoginPage.class);
	private ElementUtil elementUtil;
	private WebDriver driver;	 
	private By Login = By.xpath("//a[@class='button is-info']");
	private By username = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[text()='LOGIN']");
	
	
	public LoginPage(WebDriver driver) {
		
		
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	
	 public HomePage doLogin(String un, String pwd) 
	  { 
		  
		  elementUtil.doClick1(Login);
		  
		  System.out.println("login with: " + un + " : " + pwd);
		  elementUtil.doMoveToElement(username);
		  elementUtil.doSendKeys1(username, un);
		  logger.info("******user successfully send username******");
		 elementUtil.doMoveToElement(password);
		 elementUtil.doSendKeys1(password, pwd);
		  logger.info("******user successfully send password******");
		  elementUtil.doClick1(loginButton);
		  return new HomePage(driver);
		  
	  }


	
}
