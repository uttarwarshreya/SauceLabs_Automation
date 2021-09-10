package stepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.*;

public class YourCart {

	@When("Go to cart page")
	public void go_to_cart_page() {
		Hooks.driver.findElement(By.id("shopping_cart_container")).click();
	}

	@When("Click on continue shopping from cart page")
	public void click_on_continue_shopping_from_cart_page() {
		Hooks.driver.findElement(By.id("continue-shopping")).click();
	}
	
	@When("Click on checkout button on cart page")
	public void click_on_checkout_button_on_cart_page() {
		Hooks.driver.findElement(By.id("checkout")).click();
	}

	@Then("Verify checkout user information page displayed")
	public void verify_checkout_user_information_page_displayed() {
		assert Hooks.driver.findElement(By.id("first-name")).isDisplayed() == true;
	}
}
