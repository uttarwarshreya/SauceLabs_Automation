Feature: Your Cart
  Verify different options available on cart page
   
		@RegressionTest    
    Scenario: Verify product can be removed from cart page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on remove button
    Then Verify product removed from the cart
    
    @RegressionTest 
    Scenario: Verify that product page displayed after clicking on continue shopping
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on continue shopping from cart page
    Then Verify product page is displayed

	  @SmokeTest @RegressionTest 
    Scenario: Verify checkout page displayed after clicking on checkout page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    Then Verify checkout user information page displayed