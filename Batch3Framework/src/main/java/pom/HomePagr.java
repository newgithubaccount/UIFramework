package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class HomePagr extends BasePage{
	public HomePagr(WebDriver driver,ExtentTest test) {
		super(driver,test);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how=How.XPATH,using="//span[text()='Find friends']")
	WebElement finFriends;
	
	public boolean isFindFrindsVailable()
	{
		return finFriends.isDisplayed();
	}

}
