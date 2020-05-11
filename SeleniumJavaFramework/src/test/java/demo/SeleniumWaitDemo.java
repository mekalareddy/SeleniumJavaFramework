package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) throws InterruptedException {
		seleniumWaits();
	}
	
	public static void seleniumWaits() throws InterruptedException {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"/drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//default pool time(frequency) of Implicit Wait //250ms
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
		
	}
}