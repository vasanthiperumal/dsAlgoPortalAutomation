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
@tag1
Feature: Login
  I want to use this template for my feature file

  @tagLogin
  Scenario Outline: Sign In with the Registered user in dsportalapp Portal
    Given user navigates to the dsportalapp Login page "https://dsportalapp.herokuapp.com/login"
    When user click on SignIn link
    When user enter the <UserName>and<Password>
      When user clicks on the Login button
      Then user should be logged in
      
      Examples: 
      | UserName   | Password         | Status |
       | Livyakumar31     | LiviDhil@123       | Pass   |
       
       
  #@tagLoginDataDriven
  #Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and <RowNumber>
    #Given The user is on signin page
    #When The user enter sheet "<Sheetname>" and <RowNumber>
    #Then click login button
#
    #Examples: 
      #| Sheetname | RowNumber |
      #| Sheet1    |         0 |
      #| Sheet1    |         1 |
      #| Sheet1    |         2 |
      #| Sheet1    |         3 |
      #
#
  #@tagLoginSuccess
  #Scenario: Verifying signout link
    #Given The user is on signin page with valid username "vasanthi" and password "Hemsbujji1#"
    #When The user click signout button
    #Then The user redirected to homepage