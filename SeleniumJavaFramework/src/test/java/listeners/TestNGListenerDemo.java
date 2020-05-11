package listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='abc']")).sendKeys("abcd");
		driver.close();
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("this test is skipped");
	}
		
}