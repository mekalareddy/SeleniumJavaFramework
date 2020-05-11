package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsDemo {
	
	public static final String USERNAME = "YOUR_USERNAME";
	public static final String ACCESSKEY = "YOUR_ACCESSKEY";
	public static final String URL = "https://" + USERNAME + ":" + ACCESSKEY + "@ondemand.saucelabs.com:443/wd/hub";
	
	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platform", "Linux");
		caps.setCapability("version", "latest");
		caps.setCapability("name", "GoogleTest1");
		caps.setCapability("extendedDebugging", "true");
		caps.setCapability("buildNumber", "3.0");
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver");
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
			
		driver.quit();
		System.out.println("Test Completed");
	}
}