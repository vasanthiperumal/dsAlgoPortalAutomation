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
Feature: Tree
  I want to use this template for my feature file

@tagtree
Scenario: User validates Tree page
    Given The user is in Ninja home page to navigate to Tree Page "https://dsportalapp.herokuapp.com/home"
    When user click on Get Started button under Tree section
    And It should navigate to Tree page with title "Tree"
    When user click on Overview of Trees
    And It should navigate to Overview of Trees page with title "Overview of Trees"
    When user click on Try here in Overview of Trees page
    And It should navigate to Overview of Trees page with title "Assessment"
    When user enter the Python code in Overview of Trees page
    And click on run button in Overview of Trees page
    Then User navigate back to Overview of Trees

@tagtreeTerminologies
  Scenario: User validates Terminologies page
    When user click on Terminologies link
    Then It should navigate to Terminologies page with title "Terminologies"
    When user click on Try here in Terminologies page
    Then It should navigate to Terminologies page with title "Assessment"
    When user enter the Python code in Terminologies page
    And click on run button in Terminologies page
    Then User navigate back to Terminologies page

@tagtreeTypes
  Scenario: User validates Types of Trees page
    When user click on Types of Trees link 
    Then It should navigate to Types of Trees page with title "Types of Trees"
    When user click on Try here in Types of Trees page
    Then It should navigate to Types of Trees page with title "Assessment"
    When user enter the Python code in Types of Trees page
    And click on run button in Types of Trees page
    Then User navigate back to Types of Trees page

@tagtreeTraversals
  Scenario: User validates Tree Traversals page
    When user click on Tree Traversals link
    Then It should navigate to Tree Traversals page with title "Tree Traversals"
    When user click on Try here in Tree Traversals page
    Then It should navigate to Tree Traversals page with title "Assessment"
    When user enter the Python code in Tree Traversals page
    And click on run button in Tree Traversals page
    Then User navigate back to Tree Traversals page

@tagtreeIllustration
  Scenario: User validates Traversals-Illustration page
    When user click on Traversals-Illustration link
    Then It should navigate to Traversals-Illustration page with title "Traversals-Illustration"
    When user click on Try here in Traversals-Illustration page
    Then It should navigate to Traversals-Illustration page with title "Assessment"
    When user enter the Python code in Traversals-Illustration page
    And click on run button in Traversals-Illustration page
    Then User navigate back to Traversals-Illustration page

@tagtreeBinary
  Scenario: User validates Binary Trees page
    When user click on Binary Trees link
    Then It should navigate to Binary Trees page with title "Binary Trees"
    When user click on Try here in Binary Trees page
    Then It should navigate to Binary Trees page with title "Assessment"
    When user enter the Python code in Binary Trees page
    And click on run button in Binary Trees page
    Then User navigate back to Binary Trees page

@tagtreeBinaryTrees
  Scenario: User validate Types of Binary Trees page
    When user click on Types of Binary Trees link
    Then It should navigate to Types of Binary Trees page with title "Types of Binary Trees"
    When user click on Try here in Types of Binary Trees page
    Then It should navigate to Types of Binary Trees page with title "Assessment"
    When user enter the Python code in Types of Binary Trees page
    And click on run button in Types of Binary Trees page
    Then User navigate back to Types of Binary Trees page

@tagtreeImplementation
  Scenario: User validate Implementation in Python page
    When user click on Implementation in Python link
    Then It should navigate to Implementation in Python page with title "Implementation in Python"
    When user click on Try here in Implementation in Python page
    Then It should navigate to Implementation in Python page with title "Assessment"
    When user enter the Python code in Implementation in Python page
    And click on run button in Implementation in Python page
    Then User navigate back to Implementation in Python page

@tagtreeBinaryTraversals
  Scenario: User validate Binary Tree Traversals page
    When user click on Binary Tree Traversals link 
    Then It should navigate to Binary Tree Traversals page with title "Binary Tree Traversals"
    When user click on Try here in Binary Tree Traversals page
    Then It should navigate to Binary Tree Traversals page with title "Assessment"
    When user enter the Python code in Binary Tree Traversals page
    And click on run button in Binary Tree Traversals page
    Then User navigate back to Binary Tree Traversals page

@tagtreeImplementationBinary
  Scenario: User validate Implementation of Binary Trees page
    When user click on Implementation of Binary Trees link
    Then It should navigate to Implementation of Binary Trees page with title "Implementation of Binary Trees"
    When user click on Try here in Implementation of Binary Trees page
    Then It should navigate to Implementation of Binary Trees page with title "Assessment"
    When user enter the Python code in Implementation of Binary Trees page
    And click on run button in Implementation of Binary Trees page
    Then User navigate back to Implementation of Binary Trees page

@tagtreeApplications
  Scenario: User validate Applications of Binary trees page
    When user click on Applications of Binary trees link
    Then It should navigate to Applications of Binary trees page with title "Applications of Binary trees"
    When user click on Try here in Applications of Binary trees page
    Then It should navigate to Applications of Binary trees page with title "Assessment"
    When user enter the Python code in Applications of Binary trees page
    And click on run button in Applications of Binary trees page
    Then User navigate back to Applications of Binary trees page

@tagtreeBinarySearch
  Scenario: User validate Binary Search Trees page
    When user click on Binary Search Trees link
    Then It should navigate to Binary Search Trees page with title "Binary Search Trees"
    When user click on Try here in Binary Search Trees page
    Then It should navigate to Binary Search Trees page with title "Assessment"
    When user enter the Python code in Binary Search Trees page
    And click on run button in Binary Search Trees page
    Then User navigate back to Binary Search Trees page

@tagtreeBST
  Scenario: User validate Implementation Of BST page
    When user click on Implementation Of BST link
    Then It should navigate to Implementation Of BST page with title "Implementation Of BST"
    When user click on Try here in Implementation Of BST page
    Then It should navigate to Implementation Of BST page with title "Assessment"
    When user enter the Python code in Implementation Of BST page
    And click on run button in Implementation Of BST page
    Then user is navigated to home page from Implementation Of BST "https://dsportalapp.herokuapp.com/home"
