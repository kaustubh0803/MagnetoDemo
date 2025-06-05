package pagemodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GetUserCredentials;
import utilities.UserActions;


public class CreateAccountPage extends GetUserCredentials {

	public WebDriver driver;
	public UserActions userActions;
	public MyAccountPage myAccountPage;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="email_address")
	WebElement emailAddress;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="password-confirmation")
	WebElement confirmedPassword;
	
	@FindBy(css=".submit span")
	WebElement createAccountButton;
	
	public void enterFirstName() throws IOException {
		userActions.enterFieldValue(firstName, getFirstName());
	}
	
	public void enterLastName() throws IOException {
		userActions.enterFieldValue(lastName, getLastName());
	}
	
	public void enterEmailId() throws IOException {
		userActions.enterFieldValue(emailAddress, getEmail());
	}
	
	public void enterPassword() throws IOException {
		userActions.enterFieldValue(password, getPassword());
	}
	
	public void enterConfirmedPassword() throws IOException {
		userActions.enterFieldValue(confirmedPassword, getPassword());
	}
	
	public MyAccountPage clickCreateAccount() {
		userActions.userclick(createAccountButton);
		return myAccountPage;
	}
	
}
