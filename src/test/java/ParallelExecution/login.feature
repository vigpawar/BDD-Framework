Feature: Login page feature
  Scenario Outline: Login page title
    Given user is on login page
    When  user gets title of page
    Then page title should be "Login - My Store"
    And he clicks on sign in button
    Then he enters <username> and <password>
    Examples:
      |username  |  password |
      |"vighneshpawar778@gmail.com" | "I20@4568vtvt" |
      | "abc@gmail.com" | "pqr" |