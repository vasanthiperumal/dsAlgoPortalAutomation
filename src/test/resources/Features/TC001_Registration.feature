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
Feature: Register
  I want to use this template for my feature file

  @tagRegistration
  Scenario Outline: Create a new user via the dsportalapp Portal
    Given user navigates to the dsportalapp page url "https://dsportalapp.herokuapp.com/"
	When user clicks on Get Started button
	When user clicks on 'Register' link
	Then The user enter the <UserName> ,<Password> and <ConfirmPassword>
    And user clicks on the 'Register' button
     When user clicks on 'Sign Out link
	Then user will see a message 'Logged out successfully' and user is signed out

    Examples: 
      | UserName   | Password        | ConfirmPassword  | Status |
       | Livyakumar31     | LiviDhil@123    | LiviDhil@123     | Pass   |

      