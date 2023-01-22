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
Feature: Stack
  I want to use this template for my feature file

@tagStackOperations
  Scenario: User validates Stack page
    Given The user is in Ninja home page Stack "https://dsportalapp.herokuapp.com/home"
    When user clicks on Get Started button under Stack
    Then It should navigate to corresponding stack page with title "Stack"
    When user clicks on the link Operations in Stack
    Then It should navigate to corresponding Operations stack page with title "Operations in Stack"
    When user click on Try here link in Operations in Stack page
    Then It should navigate to Operations in Stack Assessment page with title "Assessment"
    When user enters the code in Stack page
    And click on run button in Stack page
    Then User navigate back in Stack page

@tagStackImplementation
  Scenario: User validates Implementation page
    When user click on Implementation link in Stack page
    Then It should navigate to corresponding Implementation page with title "Implementation"
    When user click on Try here  link in Implementation-Stack page
    Then It should navigate to Implementation-stack page with title "Assessment"
    When user enters the code in Implementation page
    And click on run button in Implementation page
    Then User navigate back in Implementation page

@tagStackApplications
  Scenario: User validates Applications page
    When user click on Applications link in Stack page
    Then It should navigate to corresponding Applications page with title "Applications"
    When user click on Try here link in Applications-Stack page
    Then It should navigate to Applications-stack page with title "Assessment"
    When user enters the code in Applications page
    And click on run button in Applications page
    Then user is navigated to home page from stack page "https://dsportalapp.herokuapp.com/home"
