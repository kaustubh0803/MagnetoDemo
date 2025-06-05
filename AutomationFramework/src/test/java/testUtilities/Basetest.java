package testUtilities;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagemodel.HomePage;
import utilities.GetUserCredentials;

public class Basetest extends GetUserCredentials {

	public WebDriver driver;
	
	public WebDriver initializeDriver() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
}
	
	public WebDriver launchApplication() throws IOException {
		Properties prop=PropertiesFileSetup();
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	public void teardown() {
		driver.quit();
		
	}
	
}
