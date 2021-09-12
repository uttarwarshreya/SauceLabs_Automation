package stepDefination;

import io.cucumber.java.en.*;

public class YourCart {

	@When("Go to cart page")
	public void go_to_cart_page() {
		Hooks.driver.findElement(ElementProperties.cartContainer).click();
	}

	@When("Click on continue shopping from cart page")
	public void click_on_continue_shopping_from_cart_page() {
		Hooks.driver.findElement(ElementProperties.continueShoppingButton).click();
	}
	
	@When("Click on checkout button on cart page")
	public void click_on_checkout_button_on_cart_page() {
		Hooks.driver.findElement(ElementProperties.checkoutButton).click();
	}

	@Then("Verify checkout user information page displayed")
	public void verify_checkout_user_information_page_displayed() {
		assert Hooks.driver.findElement(ElementProperties.firstNameField).isDisplayed() == true;
	}
}
