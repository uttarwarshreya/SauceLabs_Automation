package stepDefination;

import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;

public class Login {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		assert Hooks.driver.findElement(ElementProperties.userName).isDisplayed() == true;
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_username_and_password(String strUsername, String strPassword) {
		Hooks.driver.findElement(ElementProperties.userName).sendKeys(strUsername);
		Hooks.driver.findElement(ElementProperties.userPassword).sendKeys(strPassword);
	}

	@And ("clicks on login button")
	public void clicks_on_login_button() {
		Hooks.driver.findElement(ElementProperties.loginButton).click();
	}

	@Then("Verify product page is displayed")
	public void verify_product_page_displayed() {
		WebElement ele = Hooks.driver.findElement(ElementProperties.cartContainer);
		assert ele.isDisplayed() == true;
	}


	@Then("user locked out message should display")
	public void user_error_message() {
		WebElement ele = Hooks.driver.findElement(ElementProperties.loginError);
		assert ele.getText().contains("user has been locked out.");
	}


	@When("click on menu option")
	public void click_on_menu_option() {
		Hooks.driver.findElement(ElementProperties.menuOption).click();
	}

	@When("click on Logout")
	public void click_on_logout() {
		Hooks.driver.findElement(ElementProperties.logoutLink).click();

	}

	@Then("user login page should displayed")
	public void user_login_page_should_displayed() {
		WebElement ele= Hooks.driver.findElement(ElementProperties.loginButton);
		assert ele.isDisplayed() == true;
	}

}
