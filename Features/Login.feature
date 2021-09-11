Feature: Login Feature
  Verify if user is able to Login in to the site

	@SmokeTest @RegressionTest 
  Scenario Outline: Login as a authenticated user
    Given user is on login page
    When I enter Username as "<username>" and Password as "<password>"
    And clicks on login button
    Then Verify product page is displayed
    Examples:
    |username|password|
    |standard_user|secret_sauce|
    
	@SmokeTest @RegressionTest 
  Scenario: Login as a user who is locked out
    Given user is on login page
    When I enter Username as "<username>" and Password as "<password>"
    And clicks on login button
    Then user locked out message should display
		Examples:
    |username|password|
    |locked_out_user|secret_sauce|
    
	@SmokeTest @RegressionTest    
  Scenario: Login as a authenticated user and logout
    Given user is on login page
    When I enter Username as "<username>" and Password as "<password>"
    And clicks on login button
    And click on menu option
    And click on Logout
    Then user login page should displayed
    Examples:
    |username|password|
    |standard_user|secret_sauce|