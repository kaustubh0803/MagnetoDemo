package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserActions {
	
	private WebDriver driver;
	
	public UserActions(WebDriver driver) {
		this.driver=driver;
	}

	public void userclick(WebElement element) {
		element.click();
	}
	
	public  void enterFieldValue(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public  Boolean verifyRedirectedPage(WebElement element,String expectedtext) {
		Boolean match=element.getText().contains(expectedtext);
		return match;
		}
}
