package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
		public static WebDriver driver;
		String dir = System.getProperty("user.dir");
		
		public String configFilePath = dir+"/src/test/resources/TestData/Config.properties";
		public String resultFilePath = dir+"/src/test/resources/TestData/Results.properties";
		
	    
		public WebDriver initiateDefaultDriver() {
		String browserName = (String) readFile(configFilePath,"TestBrowser");
		
		switch(browserName){  
	      
	    case "Chrome":
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    break; 
	    
	    case "Firefox": 
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    break; 
	    
	    case "edge": 
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    break;  
	    
	    default:
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    }
		return driver;
		
	}
		
	public void pauseExecution(String type) {
		
		if (type.equalsIgnoreCase("short"))
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (type.equalsIgnoreCase("medium"))
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if (type.equalsIgnoreCase("long"))
		{
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public String readFile(String fileName, String propertyName) {
		
		String property = "Property Name does not exist in config file";
		try (InputStream input = new FileInputStream(fileName)) {

            Properties prop = new Properties();
            prop.load(input);
            System.out.println(prop.getProperty(propertyName));
            return prop.getProperty(propertyName);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
		System.out.println(property);
		return property;
		
	}
	
	public void writeToFile(String fieldName, String value) {
		
		Properties prop = new Properties();
	    OutputStream output = null;

	    try {
	        //load the file into properties object
	        FileInputStream input = new FileInputStream(resultFilePath);    
	        prop.load(input);
	        input.close();

	        // set the properties value
	        output = new FileOutputStream(resultFilePath);
	        prop.setProperty(fieldName, value);
	        prop.store(output, null);


	    } catch (IOException io) {
	        io.printStackTrace();
	    } finally {
	        if (output != null) {
	            try {
	                output.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		
	}
	
	
	
	public void closeDriver() {
		driver.quit();
	}
	
}
