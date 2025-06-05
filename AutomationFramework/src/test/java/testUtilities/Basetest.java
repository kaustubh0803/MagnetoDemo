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
	public HomePage homePage;
	
	public WebDriver initializeDriver() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
}
	
	public HomePage launchApplication() throws IOException {
		Properties prop=PropertiesFileSetup();
		driver.get(prop.getProperty("url"));
		return homePage;
	}
	
	public void teardown() {
		driver.quit();
		
	}
	
}
