import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args){
		
		//WebDriverManager.chromedriver().version("81.0.4044.69").setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://selenium.dev/");
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listOfInputElements.size();
		
		System.out.println("count of input elements : " + count);
		
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		
		driver.close();
		driver.quit();
		
	}

}
