#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: User Signup flow

  @tag1
  Scenario: Sign up to Create an Account
    Given the user is on the Application Home page
    And the user clicks on the Sign up link
    When the user fills the required fields for creating new customer account
    And the user clicks on create an account button
    Then the user should be redirected to my account page
    And the user must be logged in using his correct username

  @tag2
  Scenario: Successful user sign-in to the application
    Given the user is on the Application Home page
    And the user clicks on the Sign in link
    When the user enters the valid login credentials
    And the user clicks on sign in button
    Then the user should be redirected to the Application home page
    And the user must be logged in using his correct username

