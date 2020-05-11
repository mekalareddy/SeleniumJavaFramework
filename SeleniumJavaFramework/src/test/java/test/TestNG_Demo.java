package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.PropertiesFile;
import pages.GoogleSearchPage;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName = null;
	
	@BeforeTest
	public 	void setUpTest() {
		
		String path = System.getProperty("user.dir");
		PropertiesFile.getproperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", path+"/drivers/geckodriver/geckodriver");
			driver = new FirefoxDriver();
		}

	}
	@Test
	public void googleSearch() throws InterruptedException {		
		driver.get("http://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void teadDownTest() {
		driver.close();
		//driver.quit();
		PropertiesFile.setProperties();
	}

}
	