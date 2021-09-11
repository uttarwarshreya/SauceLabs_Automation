Feature: Overview
  Verify overview page and available options
   
 	  @RegressionTest 
    Scenario: Verify the information displayed on overview page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Capture First name as "Test", last name as "Surname" and Postal code as "2196" on your information page
    And Click on continue button from your information page 
    Then Verify the details like product, payment information, Shipping information, Total amount fields
    
    @RegressionTest 
    Scenario: Click cancel on Checkout page and it should navigate to Your information page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Capture First name as "Test", last name as "Surname" and Postal code as "2196" on your information page
    And Click on continue button from your information page
    And Click on cancel button from Checkout page
    Then Verify product page is displayed
    
    @SmokeTest @RegressionTest 
    Scenario: Click finish on Checkout page and verify order placed succesfully
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Capture First name as "Test", last name as "Surname" and Postal code as "2196" on your information page
    And Click on continue button from your information page
    And Click on finish button from Checkout page
    Then Order confirmation page should be displayed
    
    @RegressionTest 
    Scenario: Verify the product details page displayed when clicked on product from overview page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Capture First name as "Test", last name as "Surname" and Postal code as "2196" on your information page
    And Click on continue button from your information page 
    And Click on product title from overview page
    Then Verify product details page is displayed
    