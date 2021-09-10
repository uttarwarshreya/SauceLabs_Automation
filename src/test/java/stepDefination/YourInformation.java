package stepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.*;

public class YourInformation {
	@When("Click on cancel button from your information page")
	public void click_on_cancel_button_from_your_information_page() {
		Hooks.driver.findElement(By.id("cancel")).click();
	}

	@When("Click on continue button from your information page")
	public void click_on_continue_button_from_your_information_page() {
		Hooks.driver.findElement(By.id("continue")).click();
	}
	

	@When("^Capture First name as \"([^\"]*)\", last name as \"([^\"]*)\" and Postal code as \"([^\"]*)\" on your information page$")
	public void capture_user_information_on_your_information_page(String strFirstName, String strLastName, String strPostalCode) {
		Hooks.driver.findElement(By.id("first-name")).sendKeys(strFirstName);
		Hooks.driver.findElement(By.id("last-name")).sendKeys(strLastName);
		Hooks.driver.findElement(By.id("postal-code")).sendKeys(strPostalCode);
	}

	@Then("Error message to capture user information should be displayed")
	public void error_message_to_capture_user_information_should_be_displayed() {
	    assert Hooks.driver.findElement(By.xpath("//*[@class='error-message-container error']")).isDisplayed() == true;
	}

	@Then("Verify your cart page displayed")
	public void verify_your_cart_page_displayed() {
	    assert Hooks.driver.findElement(By.id("checkout")).isDisplayed() == true;
	}

	@Then("Overview page should be displayed")
	public void overview_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
