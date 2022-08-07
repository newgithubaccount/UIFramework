package endTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extentReports;
	public ExtentTest extentTest;
	
	@BeforeSuite
	public void suiteLevel()
	{
		htmlReporter = new ExtentHtmlReporter("./report/ExtentReport_"+System.currentTimeMillis()+".html");
    	// Create an object of Extent Reports
		extentReports = new ExtentReports();  
		extentReports.attachReporter(htmlReporter);

	}
	
	@BeforeMethod
	public void common() {
	//	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@AfterClass
	public static void after()
	{
		extentReports.flush();
	}

	
	public void sleep()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
