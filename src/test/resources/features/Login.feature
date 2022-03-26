@login
Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page


  Scenario: Validate Successful Login
    When I enter a username "webdriver"
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the successful login message

  Scenario: Validate Unsuccessful Login
    When I enter a username "webdriver"
    And I enter a password password123
    And I click on the login button
    Then I should be presented with the unsuccessful login message

  Scenario Outline: Validate - Successful & Unsuccessful Login
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with the following login validation message <loginValidationMessage>

    Examples:
      | username  | password      | loginValidationMessage |
      | webdriver | webdriver123  | validation succeeded   |
      | webdriver | password123   | validation failed      |
      | joeblogs  | pass123456789 | validation failed      |

#  Scenario: Validate Unsuccessful Login
#    When I enter a username "loeblogs"
#    And I enter a password hello123
#    And I click on the login button
#    Then I should be presented with the unsuccessful login message
#
#  Scenario: Validate Unsuccessful Login
#    When I enter a username "joeblack"
#    And I enter a password pass123456
#    And I click on the login button
#    Then I should be presented with the unsuccessful login message