Feature: Login Feature
  I want to use test my Login feature

  Scenario: Login with valid username and password
    Given I open the browser
    When I enter the url "https://practicetestautomation.com/practice-test-login/"
    And Enter username and password
    And click on submit button
    Then login will be succesful
