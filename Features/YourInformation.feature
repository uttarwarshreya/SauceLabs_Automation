Feature: Your Information
  Verify different options from your information page
    
    Scenario: Verify that your cart page displayed after clicking on cancel
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Click on cancel button from your information page
    Then Verify your cart page displayed
    
    Scenario: Verify error for mandatory field gets displayed
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Click on continue button from your information page
    Then Error message to capture user information should be displayed
    
    Scenario: Verify that overview page displayed after clicking checkout
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Capture First name as "Test", last name as "Surname" and Postal code as "2196" on your information page
    And Click on continue button from your information page 
    Then Overview page should be displayed