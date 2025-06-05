package pagemodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

public class MyAccountPage extends UserActions {

	public WebDriver driver;
	private String accountHeadertext="My Account";
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".base")
	WebElement accountHeader;
	
	public Boolean verifyAccountPageHeader() {
		return verifyRedirectedPage(accountHeader, accountHeadertext);
	}
}

	
