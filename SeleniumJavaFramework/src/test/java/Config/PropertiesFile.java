package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	static String path = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		getproperties();
		setProperties();
		getproperties();
	}
	
	public static void getproperties() {
		try {
		InputStream input = new FileInputStream(path + "/src/test/java/Config/config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		TestNG_Demo.browserName = browser;
		
	}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
	}
	
	public static void setProperties() {
		try {
		OutputStream ouput = new FileOutputStream(path + "/src/test/java/Config/config.properties");
		prop.setProperty("result", "pass");
		prop.store(ouput, null);
		}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		
	}
}
