package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class TestNG_Demo2 {
	
	private static WebDriver driver = null;
	@BeforeTest
	public static void setUpTest() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
	}
	@Test
	public static void googleSearch2() throws InterruptedException {		
		driver.get("http://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}
	@Test
	public static void googleSearch3() throws InterruptedException {		
		driver.get("http://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public static void teadDownTest() {
		driver.close();
		driver.quit();
	}

}
	