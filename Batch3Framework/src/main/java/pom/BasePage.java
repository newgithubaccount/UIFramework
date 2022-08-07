package pom;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import util.SeleniumUtils;

public class BasePage extends SeleniumUtils{
	
	WebDriver driver;
	ExtentTest test;
	
	public BasePage(WebDriver driver,ExtentTest test)
	{
		super(driver, test);
		this.driver=driver;
		this.test=test;
	}

}
