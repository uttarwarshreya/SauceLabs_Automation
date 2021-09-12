package stepDefination;


import io.cucumber.java.en.*;

public class YourInformation {
	@When("Click on cancel button from your information page")
	public void click_on_cancel_button_from_your_information_page() {
		Hooks.driver.findElement(ElementProperties.cancelButton).click();
	}

	@When("Click on continue button from your information page")
	public void click_on_continue_button_from_your_information_page() {
		Hooks.driver.findElement(ElementProperties.continueButton).click();
	}
	

	@When("^Capture First name as \"([^\"]*)\", last name as \"([^\"]*)\" and Postal code as \"([^\"]*)\" on your information page$")
	public void capture_user_information_on_your_information_page(String strFirstName, String strLastName, String strPostalCode) {
		Hooks.driver.findElement(ElementProperties.firstNameField).sendKeys(strFirstName);
		Hooks.driver.findElement(ElementProperties.lastNameField).sendKeys(strLastName);
		Hooks.driver.findElement(ElementProperties.postalCodeField).sendKeys(strPostalCode);
	}

	@Then("Error message to capture user information should be displayed")
	public void error_message_to_capture_user_information_should_be_displayed() {
	    assert Hooks.driver.findElement(ElementProperties.errorMessageContainer).isDisplayed() == true;
	}

	@Then("Verify your cart page displayed")
	public void verify_your_cart_page_displayed() {
	    assert Hooks.driver.findElement(ElementProperties.checkoutButton).isDisplayed() == true;
	}

	@Then("Overview page should be displayed")
	public void overview_page_should_be_displayed() {
		assert Hooks.driver.findElement(ElementProperties.checkoutSummaryContainer).isDisplayed() == true;
	}
}
