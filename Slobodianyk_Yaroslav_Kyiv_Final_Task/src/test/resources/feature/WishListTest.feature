Feature: Adding and deleting some products to wishlist
  As a user I want to adding my favorite glasses

  @Test1
  Scenario: I check adding product to wish list
    Given I am on the Asos Homepage
    And I go to men Clothes Page
    And I open glasses assortment
    When I choose glasses to wish list
    Then I check how much items i have in wish list

  @Test2
  Scenario: I check deleting product from wish list
    Given I am on the Asos Homepage
    And I go to men Clothes Page
    And I open glasses assortment
    When I choose glasses to wish list
    And I open wish list
    And I delete product in wish list
    Then My cart is empty
