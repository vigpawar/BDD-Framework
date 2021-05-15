Feature: Login page feature
  Scenario: Login page title
    Given user is on login page
    When  user gets title of page
    Then page title should be "Login - My Store"
    And he clicks on sign in button
    Then he enters username "vighneshpawar778@gmail.com" and password "I20@4568vtvt"
    Then user should be on home page