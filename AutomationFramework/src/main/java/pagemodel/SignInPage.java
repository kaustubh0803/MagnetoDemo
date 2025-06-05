package pagemodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.UserActions;

import utilities.GetUserCredentials;

public class SignInPage extends GetUserCredentials {

	public WebDriver driver;
	public UserActions userActions;
	public HomePage homePage;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy (xpath="//input[@name='login[password]']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='action login primary']")
	WebElement login;
	
	public void fillEmail() throws IOException {
		userActions.enterFieldValue(email, getEmail());
	}
	
	public void fillPassword() throws IOException {
		userActions.enterFieldValue(password, getPassword());
	}
	
	public HomePage clickOnCreateAccount() {
		userActions.userclick(login);
		return homePage;
	}
}
