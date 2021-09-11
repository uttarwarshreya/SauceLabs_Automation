Feature: Complete
  Verify Complete page and its options
    
    @SmokeTest @RegressionTest 
    Scenario: Verify product page gets displayed when click on back home button
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Go to cart page
    And Click on checkout button on cart page
    And Capture First name as "Test", last name as "Surname" and Postal code as "2196" on your information page
    And Click on continue button from your information page
    And Click on finish button from Checkout page
    And Click on Back Home button from Checkout:Complete page
    Then Verify product page is displayed