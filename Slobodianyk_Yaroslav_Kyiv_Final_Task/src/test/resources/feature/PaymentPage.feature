Feature: Select payment method on market page
  As a user I want to choose payment method

  @Test1
  Scenario: I check payment method in marketplace
    Given I am on the Asos Homepage
    And I go to marketplace
    And I choose select payment method button
    And I choose USD payment method
    And I click save button
    When I click on first section
    Then I must see sign