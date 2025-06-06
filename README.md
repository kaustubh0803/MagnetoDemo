# MagnetoDemo
Testing of Magneto Automation website Signup:

  This project Showcases the Automated testing flow for Magneto Software tessting E-commerce page. The framework is built by integrationg Selenium Webdriver with Java, implementation of Behaviour driven 
  Development    using Cucumber, Page Object Model for Framework design and Maven for build management and TestNG for annotations and execution.

# Project Summary
Test Site: https://magento.softwaretestingboard.com/

The Projects automates below Scenarios for the application:

--> New User Account Creation (SignIn)

--> Registered User Login (SignIn)

--> Verification of Successful account creation and successful login.

# Technologies Used
--> Java 11

--> Selenium WebDriver

--> TestNg

--> Cucumber for BDD

--> Maven

# Project Components
   * PAGE OBJECTS

     --> HomePage : Consists of Application landing page elements and methods

     --> CreateAccountPage: Consists of elements and methods for new user signup

     --> SignInPage: Consists of elements and Methods for registerd user login/signin

     --> My Account: Consists of elements and methods for verifying new user account creation.

 * UTILITIES

    --> GlobalParameters.properties file: Contains all the reusable parameters used throughout the framework.

    --> GetUserCredentials: contains methods to obtain various field values from the GolbalParameters properties file used throughout the framework.

    --> UserActions: contains reusable methods for different actions performed used throughout the framework.

    --> BaseClass: Contains general methods used for browser interactions with the Test class.

* Test Framework

  --> MagnetoSignin.feature: BDD Cucumber feature file describing Test Scenarios and test steps for them.

  --> StepDefinition : contains the test and logic implementation for the test steps for all the test scenarios.

  --> Runner: Contains Cucumber runner class with required Cucumber options.

# Running the Test Framework

  * Using TestNg
  
     --> Simply rightclick the Runner.java file in the runner package and Select "Run As--> TestNg Test"

  * Using Maven command line

     Provided integration with maven surefire plugin which allows to run the framework through maven command line:
  
     --> Clone the repository in the system.
  
     --> Go to the repository path from command prompt.
  
     --> Commands: mvn clean test


