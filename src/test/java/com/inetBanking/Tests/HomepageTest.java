package com.inetBanking.Tests;

import org.testng.annotations.BeforeClass;

import com.inetBanking.Base.BaseTest;

public class HomepageTest extends BaseTest {

	
	@BeforeClass
	public void homePageSetUp() {
		homePage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
}
