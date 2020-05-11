package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNGMultiBrowserDemo {
	
	WebDriver driver = null;
	String path = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser Name is : " + browserName);	
		System.out.println("Thread id is : " + Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", path + "/drivers/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://google.com/");
		Thread.sleep(4000);	
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}

}
