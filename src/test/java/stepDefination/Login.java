package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Login {
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_username_and_password(String strUsername, String strPassword) {
		Hooks.driver.findElement(By.id("user-name")).sendKeys(strUsername);
		Hooks.driver.findElement(By.id("password")).sendKeys(strPassword);
		//throw new io.cucumber.java.PendingException();
	}

	@And ("clicks on login button")
	public void clicks_on_login_button() {
		Hooks.driver.findElement(By.id("login-button")).click();
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Verify product page is displayed")
	public void verify_product_page_displayed() {
		WebElement ele = Hooks.driver.findElement(By.id("shopping_cart_container"));
		assert ele.isDisplayed() == true;
		//throw new io.cucumber.java.PendingException();
	}


	@Then("user locked out message should display")
	public void user_error_message() {
		//h3[@data-test="error"]
		WebElement ele = Hooks.driver.findElement(By.xpath("//h3[@data-test='error']"));
		assert ele.getText().contains("user has been locked out.");
	}


	@When("click on menu option")
	public void click_on_menu_option() {
		Hooks.driver.findElement(By.id("react-burger-menu-btn")).click();
	}

	@When("click on Logout")
	public void click_on_logout() {
		Hooks.driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

	@Then("user login page should displayed")
	public void user_login_page_should_displayed() {
		WebElement ele= Hooks.driver.findElement(By.id("login-button"));
		assert ele.isDisplayed() == true;
	}

}
