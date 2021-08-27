package com.inetBanking.Tests;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.Base.BaseTest;
import com.inetBanking.utilities.ExcelUtil;



public class TC_LoginTestDDT_002 extends BaseTest {
	
	
	
	@DataProvider
	public Object[][] getLoginData() throws InvalidFormatException{
		Object data[][] = ExcelUtil.getTestData("Sheet1");
		return data;
		
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginDataTest(String un, String pwd) throws InterruptedException {
		loginPage.doLogin(un, pwd);
		homePage.navigateToLoginPage();
	}
	
	
}
