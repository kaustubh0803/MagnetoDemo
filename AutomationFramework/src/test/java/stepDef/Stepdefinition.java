package stepDef;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemodel.CreateAccountPage;
import pagemodel.HomePage;
import pagemodel.MyAccountPage;
import pagemodel.SignInPage;
import testUtilities.Basetest;

public class Stepdefinition extends Basetest {

	private WebDriver driver;
	private HomePage homePage;
	private CreateAccountPage createAccountPage;
	private MyAccountPage myAccountPage;
	private SignInPage signInPage;
	
	
	@Given("the user is on the Application Home page")
	public void the_user_is_on_the_application_home_page() throws IOException {
		driver=launchApplication();
	}

	@Given("the user clicks on the Sign up link")
	public void the_user_clicks_on_the_sign_up_link() {
	    homePage=new HomePage(driver);
	    homePage.gotoSignupPage();
	    
	}

	@When("the user fills the required fields for creating new customer account")
	public void the_user_fills_the_required_fields_for_creating_new_customer_account() throws IOException   {
		createAccountPage=new CreateAccountPage(driver);
	    createAccountPage.enterFirstName();
	    createAccountPage.enterLastName();
	    createAccountPage.enterEmailId();
	    createAccountPage.enterPassword();
	    createAccountPage.enterConfirmedPassword();
	}
	@When("the user clicks on create an account button")
	public void the_user_clicks_on_create_an_account_button() {
		createAccountPage=new CreateAccountPage(driver);
		createAccountPage.clickCreateAccount();
	}

	@Then("the user should be redirected to my account page")
	public void the_user_should_be_redirected_to_my_account_page() {
		myAccountPage=new MyAccountPage(driver);
	   Assert.assertTrue(myAccountPage.verifyAccountPageHeader(), "Account creation failed");
	}

	@Then("the user account should have correct username")
	public void the_user_account_should_have_correct_username() throws IOException {
		myAccountPage=new MyAccountPage(driver);
	    Assert.assertTrue(myAccountPage.verifysuccessfulAccountCreation(), "Incorrect username Present");
	    teardown();
	}

	@Given("the user clicks on the Sign in link")
	public void the_user_clicks_on_the_sign_in_link() {
		homePage=new HomePage(driver);
	    homePage.goToSigninPage();
	}
	@When("the user enters the valid login credentials")
	public void the_user_enters_the_valid_login_credentials() throws IOException {
		signInPage=new SignInPage(driver);
	    signInPage.fillEmail();
	    signInPage.fillPassword();
	    
	}

	@When("the user clicks on sign in button")
	public void the_user_clicks_on_sign_in_button() {
		signInPage=new SignInPage(driver);
		signInPage.clickOnCreateAccount();
	}

	@Then("the user should be redirected to the Application home page")
	public void the_user_should_be_redirected_to_the_application_home_page() {
		homePage=new HomePage(driver);
	    Assert.assertTrue(homePage.verifyHomePageHeader(),"Sign in failed");
	}

	@Then("the user must be logged in using his correct username")
	public void the_user_must_be_logged_in_using_his_correct_username() throws IOException {
		homePage=new HomePage(driver);
	    Assert.assertTrue(homePage.verifysuccessfulLogin(), "Incorrect username present");
	    teardown();
	}
}
