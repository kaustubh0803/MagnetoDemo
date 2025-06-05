package pagemodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
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
	
	public String getHomePageHeaderText() {
		return homePageHeader.getText();
	}
}
