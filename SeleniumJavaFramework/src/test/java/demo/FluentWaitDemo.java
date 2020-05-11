package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}

	public static void test() throws Exception {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ABCD - NIMH");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH")).click();;
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, TimeUnit.SECONDS)
		       .pollingEvery(2, TimeUnit.SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       WebElement linkelement =  driver.findElement(By.linkText("ABCD - NIMH Data Archive - NIH"));
		       
		       if(linkelement.isEnabled()) {
		    	   System.out.println("element found");
		       }
		       return linkelement;
		     }
		   });
		   
		   element.click();
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
	
}
