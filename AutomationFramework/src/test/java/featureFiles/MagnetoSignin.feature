
@tag
Feature: User Signup flow

  @tag1
  Scenario: Sign up to Create an Account
    Given the user is on the Application Home page
    And the user clicks on the Sign up link
    When the user fills the required fields for creating new customer account
    And the user clicks on create an account button
    Then the user should be redirected to my account page
    And the user account should have correct username

  @tag2
  Scenario: Successful user sign-in to the application
    Given the user is on the Application Home page
    And the user clicks on the Sign in link
    When the user enters the valid login credentials
    And the user clicks on sign in button
    Then the user should be redirected to the Application home page
    And the user must be logged in using his correct username

