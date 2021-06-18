Feature: Adding and deleting other products on cart page
  As a user I want to add product to cart and remove product from cart

  @Test1
  Scenario: I check adding clothes to cart
    Given I am on the Asos Homepage
    And I go to men Clothes Page
    And I click on shirts assortment page
    When I open favorite shirt
    And I open size shirt
    And I choose M size
    And I add shirt to cart
    Then I check how much products I have in a cart

  @Test2
    Scenario: I check deleting clothes from cart
    Given I am on the Asos Homepage
    And I go to men Clothes Page
    And I click on shirts assortment page
    When I open favorite shirt
    And I open size shirt
    And I choose M size
    And I add shirt to cart
    And I go to cart
    And I remove item from cart
    Then I check that the cart is empty
