Feature: Login page feature
  Scenario: Login page title
    Given user is on login page
    When  user gets title of page
    Then page title should be "Account Login"