package pagemodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GetUserCredentials;
import utilities.UserActions;


public class CreateAccountPage extends UserActions {

	public WebDriver driver;
	public MyAccountPage myAccountPage;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
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
		enterFieldValue(firstName, GetUserCredentials.getFirstName());
	}
	
	public void enterLastName() throws IOException {
		enterFieldValue(lastName, GetUserCredentials.getLastName());
	}
	
	public void enterEmailId() throws IOException {
		enterFieldValue(emailAddress, GetUserCredentials.generateEmail());
	}
	
	public void enterPassword() throws IOException {
		enterFieldValue(password, GetUserCredentials.getPassword());
	}
	
	public void enterConfirmedPassword() throws IOException {
		enterFieldValue(confirmedPassword, GetUserCredentials.getPassword());
	}
	
	public void clickCreateAccount() {
		userclick(createAccountButton);
	}
	
}
