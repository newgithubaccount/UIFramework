package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import util.ExcelReader;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.ID, using = "email")
	WebElement username;
	@FindBy(how = How.NAME, using = "pass")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@data-testid='royal_login_button']")
	WebElement login;

	public void login() {
		test.info("entering username ");
		username.sendKeys(ExcelReader.getUsername());
		test.info("entering password ");
		password.sendKeys(ExcelReader.getPassword());
		test.info("ciicking login ");
		login.click();
	}
	
	public void invalidlogin() {
		test.info("entering username ");
		username.sendKeys(ExcelReader.getUsername());
		test.info("entering password ");
		password.sendKeys("dummy@123354345");
		test.info("ciicking login ");
		login.click();
	}


}
