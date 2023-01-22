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
Feature: HomePage
  I want to use this template for my feature file

  @tagHome
  Scenario: User validates Home page
    Given user navigates to the dsportalapp webpage "https://dsportalapp.herokuapp.com/"
    When user clicks on Get Started button in Home
    Then The user clicks on data structures dropdown
    When The user select any one of the dropdown menu
    Then It should Alert the user with the message "You are not logged in"
    When The user click any of the Get started button in home page
    Then It should Alert the user with the message2 "You are not logged in"
    When The user click on Register
    Then The user should be redirected to Register page
