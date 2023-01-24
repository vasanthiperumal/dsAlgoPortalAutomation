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
Feature: Array
  I want to use this template for my feature file

@tagarray
 Scenario: User validates Array Page
    Given The user is in Ninja home page to navigate to Array Page "https://dsportalapp.herokuapp.com/home"
    Then click on Get started button under array
    And It should navigate to corresponding Array page with title "Array"
    When user click on Arrays in Phython link
    And It should navigate to corresponding Arrays in Python page with title "Arrays in Python"
    Then user click on Try here in Arrays in Python page
    And It should navigate to corresponding Arrays in Python Assessment page with title "Assessment"
    When user enter the Python code in Arrays in Python page
    And click on run button in Arrays in Python Assessment page
   Then User navigates back to Arrays in Python page
 
@tagarraylist  
  Scenario: User validate Arrays using list page
    When User click on Arrays using list
    And It should navigate to corresponding Arrays Using List page with title "Arrays Using List"
    Then user click on Try here in Arrays Using List page
    And It should navigate to corresponding Arrays Using List Assessment page with title "Assessment"
    When user enter the Python code in Arrays Using List page
    And click on run button in Arrays Using List Assessment page
    Then User navigate back to Arrays Using List page 

@tagarraybasic	
  Scenario: User validate Basic Operations in list page
    When User click on Basic Operations in list
    And It should navigate to corresponding Operations in list page with title "Basic Operations in Lists"
    Then user click on Try here in Operations in list page
    And It should navigate to corresponding Operations in list Assessment page with title "Assessment"
    When user enter the Python code in Operations in list page
    And click on run button in Operations in list Assessment page
    Then User navigate back to Operations in list page

@tagarrayapplications
  Scenario: User validate Applications of Array page
    When User click on Applications of Array
    And It should navigate to corresponding Applications of Array page with title "Applications of Array"
    Then user click on Try here in Applications of Array page
    And It should navigate to corresponding Applications of Array Assessment page with title "Assessment"
    When user enter the Python code in Applications of Array page
    And click on run button in Applications of Array page
    Then User navigate back to Applications of Array page
    
@tagarraypractice
  Scenario: User validate Practice Questions page
  When user click on Practice Questions
    And It should navigate to corresponding Practice Questions page with title "Practice Questions"

@tagarraypracticesearch
  Scenario Outline: User validates Search the array page
    When user click on Search the array link
    And It should navigate to corresponding Search the array page with title "Assessment"
    When user enter the Python code in Search the array page
     And click on run button in Search the array page
    Then User navigate back to Search the array page


@tagarraypracticemax
  Scenario Outline:  User validates Max Consecutive Ones page
    When user clicks on Max Consecutive Ones link
    And It should navigate to corresponding Max Consecutive Ones page with title "Assessment"
    When user clear the text and enter the Python code in Max Consecutive Ones page
    And click on run button in Max Consecutive Ones Assessment page
    Then User navigate back to Max Consecutive Ones

@tagarraypracticeeven
  Scenario Outline: User validate Even Number page
    When user click on Find Numbers with Even Number of Digits
    And It should navigate to corresponding Even Number page with title "Assessment"
    When user clear the text and enter the Python code in Even Number Assessment page
    And click on run button in Even Number page
    Then User navigate back to Even Number page

@tagarraypracticesquare
  Scenario Outline: User validate Sorted Array page
    When user click on Find Numbers with Squares of  a Sorted Array
    And It should navigate to corresponding Sorted Array page with title "Assessment"
    When user clear the text and enter the Python code in Sorted Array Assessment page
    And click on run button in Sorted Array page
    Then user is navigated to home page from Sorted Array page "https://dsportalapp.herokuapp.com/home"
 
