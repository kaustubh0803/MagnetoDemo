package pagemodel;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GetUserCredentials;
import utilities.UserActions;

public class HomePage extends UserActions{

	public WebDriver driver;
	public GetUserCredentials userCredentials;
	
	private String homePageHeadertext="Home Page";
	SignInPage signInPage;
	CreateAccountPage createAccountPage;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@href,'login')]")
	WebElement signinButton;
	
	@FindBy(xpath="//a[contains(text(),'Create an Account')]")
	WebElement signupButton;
	
	@FindBy(css=".base")
	WebElement homePageHeader;
	
	@FindBy(css = ".logged-in")
	WebElement username;
	
	public void verifyHomePageHeader() {
		verifyRedirectedPage(homePageHeader, homePageHeadertext);
	}
	
	public CreateAccountPage gotoSignupPage() {
		userclick(signupButton);
		return createAccountPage;
		
	}
	
	public boolean verifysuccessfulLogin() throws IOException {
		return username.getText().contains(userCredentials.getFirstName()) && username.getText().contains(userCredentials.getLastName());
	}
	
	public SignInPage goToSigninPage() {
		userclick(signinButton);
		return signInPage;
	}
}
