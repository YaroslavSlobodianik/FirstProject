Feature: Search main actions that can can make user
  As a user I want to find my favorite boots and find home button

  @Test1
  Scenario: I check the text of head article about sales
    Given I am on the Asos Homepage
    When I make search by value 'Nike'
    Then I verify that product contains text Nike

  @Test2
  Scenario: As a user I check main logo page
    Given I am on the Asos Homepage
    When I go to sales page
    And I click on main logo
    Then I find main page