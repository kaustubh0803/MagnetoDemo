package pagemodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GetUserCredentials;
import utilities.UserActions;

public class MyAccountPage extends UserActions {

	private WebDriver driver;
	private GetUserCredentials userCredentials;
	private String accountHeadertext="My Account";
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".base")
	WebElement accountHeader;
	
	@FindBy(css = ".logged-in")
	WebElement username;
	
	public Boolean verifyAccountPageHeader() {
		return verifyRedirectedPage(accountHeader, accountHeadertext);
	}
	
	public boolean verifysuccessfulAccountCreation() throws IOException {
		return username.getText().contains(GetUserCredentials.getFirstName()) && username.getText().contains(GetUserCredentials.getLastName());
	}
}

	
