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
Feature: Graph
  I want to use this template for my feature file

@taggraph
  Scenario: User validates Get Started On Graph page
     Given The user is in Ninja home page to navigate to graph Page "https://dsportalapp.herokuapp.com/home"
    When user click on Get Started button on Graph
    Then It should navigate to Graph page with title "Graph"
    When user click on Graph link
    When user click on Try here
    Then It should navigate to Graph Assessement page with title "Assessment"
    When user enter the Python code in graph page
    And click on run button in graph page
    Then User navigate back from  graph page

@taggraphrep
  Scenario: User validate Graph Representations page
    When user click on Graph Representations link
    Then It should navigate to Graph Representations page with title "Graph Representations"
    When user click on Try here in Graph Representations page
    Then It should navigate to Graph Representations page with title "Assessment"
    When user enter the Python code in Graph Representations page
    And click on run button in Graph Representations page
    Then user is navigated to home page from Graph Representations page "https://dsportalapp.herokuapp.com/home"
   
