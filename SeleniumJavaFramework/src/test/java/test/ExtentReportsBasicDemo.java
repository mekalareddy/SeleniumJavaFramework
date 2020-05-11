package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.GoogleSearchPage;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		@SuppressWarnings("deprecation")
		ExtentHtmlReporter ExtentHtmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(ExtentHtmlReporter);

		ExtentTest test = extent.createTest("Google Search Test", "this is for validating google search functionality");
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		test.pass("Navigated to google.com");
		
		test.log(Status.INFO, "Stating test case");
		driver.get("http://google.com");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		test.pass("Entered text in search box");
		
		Thread.sleep(2000);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		test.pass("pressed keyboard enter key");
		
		driver.close();
		driver.quit();
		test.pass("closed browser");
		
		test.info("test completed");
		
		extent.flush();
		
	}

}
