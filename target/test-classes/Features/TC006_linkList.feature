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
Feature: Linklist
  I want to use this template for my feature file

@taglinkIntro
  Scenario: User validates LinkList Introduction page
    Given The user is in Ninja home page "https://dsportalapp.herokuapp.com/home"
    When user click on Get Started button on Linklist
    Then It should navigate to appropriate page with title "Linked List"
    When user click on Introduction link
    Then It should navigate to appropriate page with title Introduction "Introduction"
    When user click on Try here button in Introduction page
    Then It should navigate to appropriate page with title Assessment "Assessment"
    When user enter the code in linklist assesement page
    And click on run button in linklist assesement page
    Then User navigate back from linklist assesement page

@tagcreatelink
  Scenario: User validates Creating Linked List page
    When user click on Creating Linked List
    Then It should navigate to appropriate page with title "Creating Linked LIst"
    When user click on Try here button in Linked List page
    Then It should navigate to appropriate page with title "Assessment"
    When user enter the code in Creating Linked List page
    And click on run button in Creating Linked List page
    Then User navigate back from Creating Linked List page

@taglinkedlist
  Scenario: User validate Types of Linked List page
    When user click on Types of Linked List
    Then It should navigate to appropriate page with title "Types of Linked List"
    When user click on Try here button in Types of Linked List
    Then It should navigate to appropriate page with title "Assessment"
    When user enter code in Types of Linked List
     And click on run button in Types of Linked List
    Then User navigate back from Types of Linked List

@tagimplementlist
  Scenario: User validate Implement Linked List in Python page
    When user click on Implement Linked List in Python
    Then It should navigate to appropriate page with title "Implement Linked List in Python"
    When user click on Try here button in Implement Linked List
    Then It should navigate to appropriate page with title "Assessment"
    When user enter code in Implement Linked List page
    And click on run button in Implement Linked List page
    Then User navigate back from Implement Linked List page

@tagTraversal
  Scenario: User validate Traversal page
    When user click on Traversal link
    Then It should navigate to appropriate page with title "Traversal"
    When user click on Try here button in Traversal link page
    Then It should navigate to appropriate page with title "Assessment"
    When user enter the code in Traversal link page
    And click on run button in Traversal link page
    Then User navigate back from Traversal link page

@tagInsertion
  Scenario: User validate Insertion page
    When user click on Insertion link
    Then It should navigate to appropriate page with title "Insertion"
    When user click on Try here button in Insertion link page
    Then It should navigate to appropriate page with title "Assessment"
    When user enter code in Insertion link page
    And click on run button in Insertion link page 
    Then User navigate back from Insertion link page

@tagDeletion
  Scenario: User validate Deletion page
    When user click on Deletion link
    Then It should navigate to appropriate page with title "Deletion"
    When user click on Try here button in Deletion page
    Then It should navigate to appropriate page with title "Assessment"
    When user enter the code in in Deletion page
    And click on run button in Deletion page
    Then User navigate back from Deletion page
