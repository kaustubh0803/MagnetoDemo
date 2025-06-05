package pagemodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UserActions;

public class HomePage extends UserActions{

	public WebDriver driver;
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
	
	public void verifyHomePageHeader() {
		verifyRedirectedPage(homePageHeader, homePageHeadertext);
	}
	
	public CreateAccountPage gotoSignupPage() {
		userclick(signupButton);
		return createAccountPage;
		
	}
	
	public SignInPage goToSigninPage() {
		userclick(signinButton);
		return signInPage;
	}
}
