package endTests;

import org.testng.annotations.Test;

import pom.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest()
	{
		extentTest=extentReports.createTest("Valid Login");
		LoginPage loginPage=new LoginPage(driver,extentTest);
		loginPage.login();
	}
	@Test
	public void invalidLoginTest()
	{
		extentTest=extentReports.createTest("InValid Login");
		LoginPage loginPage=new LoginPage(driver,extentTest);
		loginPage.invalidlogin();
	}

}
