package pagemodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.UserActions;

import utilities.GetUserCredentials;

public class SignInPage extends UserActions {

	private WebDriver driver;
	private HomePage homePage;
	
	public SignInPage(WebDriver driver) {
		super(driver);
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
		enterFieldValue(email, GetUserCredentials.getEmail());
	}
	
	public void fillPassword() throws IOException {
		enterFieldValue(password, GetUserCredentials.getPassword());
	}
	
	public void clickOnCreateAccount() {
		userclick(login);
		
	}
}
