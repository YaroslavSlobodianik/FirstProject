Feature: Correct article on the Asos Men page
  As a user I want to be sure that all articles are correct and true
  I want to be able to make search in the Asos

  @Test1
  Scenario: I check the text of head article about sales
    Given I am on the Asos Homepage
    When I go to sales page
    Then The correct head article about sales is displayed

  @Test2
  Scenario: I check a new goods on sales page
    Given I am on the Asos Homepage
    When I go to sales page
    And I check sort menu
    Then I choose new goods