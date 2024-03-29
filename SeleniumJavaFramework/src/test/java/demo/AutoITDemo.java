package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("location of autoit exe");
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}

}
