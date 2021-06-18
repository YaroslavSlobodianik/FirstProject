Feature: Watch negative reaction on AuthorizationPage
  As a user I want to check negative reaction on wrong actions

  @Test1
  Scenario: I check negative reaction on absence password
    Given I am on the Asos Homepage
    When I go to authorization page
    And I enter email
    And I click on sign button
    Then I have error massage