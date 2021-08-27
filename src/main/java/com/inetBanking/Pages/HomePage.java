package com.inetBanking.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.inetBanking.Base.BasePage;
import com.inetBanking.utilities.ElementUtil;

public class HomePage extends BasePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;

	private By logout = By.xpath("//ul[@class = 'menusubnav']/li/a[text()='Log out']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	

	public LoginPage navigateToLoginPage() throws InterruptedException {
		//eleUtil.doClick(logout);

		if(isAlertPresent() == false) {
			Assert.assertTrue(true);
			Thread.sleep(1000);

			eleUtil.doClick(logout);
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();			
		}
		else {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
		}

		return new LoginPage(driver);
	}
	
	
	
	
	
	public boolean isAlertPresent() {
		try{
			driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e) {
			return false;
		}
		
	}

}
