
package com.inetBanking.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.Properties;

import com.inetBanking.Pages.HomePage;
import com.inetBanking.Pages.LoginPage;


public class BaseTest {

	public WebDriver driver;
	public Properties prop;
	public BasePage basePage;
	public LoginPage loginPage;
	public HomePage homePage;
	
	
	
	@BeforeTest
	public void setUp() {
		
		basePage = new BasePage();
		prop = basePage.init_prop();
		String browser = prop.getProperty("browser");
		driver = basePage.init_driver(browser);				
		loginPage = new LoginPage(driver);		
		driver.get(prop.getProperty("url"));
	}
	
	@AfterTest
	public void tearDown()  {
		driver.quit();
	}
}
