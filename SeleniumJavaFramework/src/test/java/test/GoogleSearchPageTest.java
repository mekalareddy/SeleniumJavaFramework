package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects googleSearchPageObjects = new GoogleSearchPageObjects(driver);
		
		driver.get("http://google.com/");
		
		googleSearchPageObjects.setTextInSearchBox("Automation Step by Step");
		
		Thread.sleep(2000);
		
		googleSearchPageObjects.clickSearchButton();
		
		driver.close();
		driver.quit();
	}
}