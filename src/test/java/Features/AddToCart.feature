Feature: This feature will be used to test Add to cart featurefor sauce demo application

  Background: Add to cart feature
    Given I have launch the application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on home page
    
@Addtocart
  Scenario: Add the product to cart
    When I click on product name as "Sauce Lab Backpack"
    And I click on Add to cart button
    And I click on Shopping cart link
    Then I Validate whether product is displayed in cart on cart page.
