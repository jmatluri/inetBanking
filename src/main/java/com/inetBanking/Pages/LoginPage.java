package com.inetBanking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.inetBanking.Base.BasePage;
import com.inetBanking.utilities.Constants;
import com.inetBanking.utilities.ElementUtil;



public class LoginPage extends BasePage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By userID = By.name("uid");
	private By password = By.name("password");
	private By btnLogin = By.name("btnLogin");
	
	//private By logout = By.xpath("//ul[@class = 'menusubnav']/li/a[text()='Log out']");

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		
	}
	
	public String getLoginPageTitle() {
		 //return driver.getTitle();
		return elementUtil.waitForTitlePresent(Constants.LOGIN_PAGE_TITLE, 10);
	}
	

	


	public HomePage doLogin(String userName, String pwd) {
		System.out.println("logging with username:" +userName + "password: " +pwd);
		elementUtil.doSendKeys(userID, userName);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(btnLogin);
		
		return new HomePage(driver);
	}

	
	
	
}
