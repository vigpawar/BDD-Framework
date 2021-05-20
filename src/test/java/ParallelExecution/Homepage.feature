Feature: Search product feature
  Scenario: Search Product
    Given user is already on homepage
    When  user enter product name in searchbox
    Then user should get list of selected products