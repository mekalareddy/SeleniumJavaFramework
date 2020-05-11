package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class Test1_GoogleSearch {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		googleSearch();
		
	}
	
	public static void googleSearch() throws InterruptedException {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
	}

}
	