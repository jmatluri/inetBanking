package com.inetBanking.Tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.Base.BaseTest;
import com.inetBanking.utilities.Constants;

public class TC_LoginTest_001 extends BaseTest {
	
	
	
	@Test(priority = 0)
	public void getLoginPageTitle() {
		String loginTitle = loginPage.getLoginPageTitle();
		System.out.println("login page title is" +loginTitle);
		Assert.assertEquals(loginTitle,Constants.LOGIN_PAGE_TITLE);
	}
	
	
	@Test(priority = 1)
	public void loginTest() throws IOException {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
