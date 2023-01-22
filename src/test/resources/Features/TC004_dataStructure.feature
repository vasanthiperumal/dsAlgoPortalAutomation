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
Feature: DataStructure
  I want to use this template for my feature file
  
  @tagDataStructure
  Scenario: User validate DataStructure Introduction page
    Given The user navigates to Home Page "https://dsportalapp.herokuapp.com/home"
    When user click on Get started button in Data Structure page
    Then It should navigate to corresponding page with title "Data Structures-Introduction"
    When user click on Time Complexity link
    Then It should navigate to corresponding page with title "Time Complexity"
    When user click on Try here button
    Then It should navigate to corresponding page with title "Assessment"
    When user enter the code
     
    And click on run button
    And click on back button
    Then user is navigated to home page "https://dsportalapp.herokuapp.com/home"

