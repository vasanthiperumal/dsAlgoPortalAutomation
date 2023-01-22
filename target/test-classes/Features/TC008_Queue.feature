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
Feature: Queue
  I want to use this template for my feature file

@tagImplementation
  Scenario: User validates Implementation of Queue in Python page
     Given The user is in Ninja home page Queue "https://dsportalapp.herokuapp.com/home"
    When user clicks on Get Started button under Queue
    And It should navigates to corresponding page with title Queue "Queue"
    When user clicks on Implementation of Queue in Python
    When user clicks on Try here
    And It should navigate to corresponding page with title Queue "Assessment"
    When user enters the code in Implementation of Queue in Python Assessment page
    And clicks on run button
    Then User navigates back

@tagImplementationdeque
  Scenario: User validates Implementation using collections.deque page
    When user clicks on Implementation using collections.deque
    And It should navigate to corresponding page with title Queue deque "Implementation using collections.deque"
    When user clicks on Try here link
    And It should navigate to corresponding page with title Queue deque"Assessment"
    When user enters the code in Implementation using collections.deque Assessment page
    And clicks on run button
    Then User navigates back

@tagImplementationarray
  Scenario: User validates Implementation using array page
    When user click on Implementation using array
    And It should navigates to corresponding page with title array "Implementation using array"
    When user clicks on Try here link
    And It should navigate to corresponding page with title array "Assessment"
    When user enters the code in Implementation using array Assessment page
    And clicks on run button
    Then User navigates back

@tagImplementationOperations
  Scenario: User validates Queue Operations page
    When user clicks on Queue Operations link
    And It should navigate to corresponding page with title operations "Queue Operations"
    When user clicks on Try here
    And It should navigates to corresponding page with title operations "Assessment"
    When user enters the code in Queue Operations Assessment page
    And clicks on run button
    Then User navigates back to home page "https://dsportalapp.herokuapp.com/home"
