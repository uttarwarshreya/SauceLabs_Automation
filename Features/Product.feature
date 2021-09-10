Feature: Products
  Verify if products are displayed and users can perform different actions

    Scenario: Verify product can be added to cart from products page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    Then Verify product added to cart
    
    Scenario: Remove product from cart by clicking remove from product page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Click on remove button
    Then Verify product removed from the cart
    
    Scenario: Verify products details page displays when clicked on a product
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on "Sauce Labs Backpack" product title
    Then Verify product details page is displayed
    And Verify product matches with the product selected
    
    Scenario: Verify products can be added from product details page
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on "Sauce Labs Backpack" product title
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Verify product added to cart
    
    Scenario: Verify products page displays when clicked on Back to products
    Given user is on login page
    When I enter Username as "standard_user" and Password as "secret_sauce"
    And clicks on login button
    And Click on Add to cart for the product "Sauce Labs Backpack"
    And Click on "Sauce Labs Backpack" product title
    And Click on Back to products
    And Verify product page is displayed