package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementProperties 
{
	WebDriver driver;
	
	static By userName = By.id("user-name");
	static By userPassword = By.id("password");
	static By loginButton = By.id("login-button");
	static By cartContainer = By.id("shopping_cart_container");
	static By checkoutSummaryContainer = By.id("checkout_summary_container");
	static By loginError = By.xpath("//h3[@data-test='error']");
	static By menuOption = By.id("react-burger-menu-btn");
	static By logoutLink = By.id("logout_sidebar_link");
	static By backToProducts = By.id("back-to-products");
	static By cancelButton = By.id("cancel");
	static By continueButton = By.id("continue");
	static By finishButton = By.id("finish");
	static By checkoutButton = By.id("checkout");
	static By firstNameField = By.id("first-name");
	static By lastNameField = By.id("last-name");
	static By postalCodeField = By.id("postal-code");
	static By errorMessageContainer = By.xpath("//*[@class='error-message-container error']");
	static By continueShoppingButton =By.id("continue-shopping");
	static By completeHeader = By.xpath("//*[@class='complete-header']");
	static By inventoryItemName = By.xpath("//*[@class='inventory_item_name']");
	static By summaryInfo1 = By.xpath("//div[@class='summary_info']//div[2]");
	static By summaryInfo2 = By.xpath("//div[@class='summary_info']//div[4]");
	static By inventoryDetailsName = By.xpath("//*[@class='inventory_details_name large_size']");
	
	public ElementProperties(WebDriver driver) {
		this.driver = driver;
	}

}
