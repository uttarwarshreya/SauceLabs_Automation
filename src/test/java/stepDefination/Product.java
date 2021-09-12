package stepDefination;

import org.openqa.selenium.By;
import io.cucumber.java.en.*;

public class Product {
	String strPropertyValue = null;
	String strTempPropertyValue = null;
	public static String strProductTitle = null;
	
	
	@When ("^Click on Add to cart for the product \"([^\"]*)\"$")
	public void Add_product_to_cart(String strProduct) {
		strProductTitle = strProduct;
		strTempPropertyValue = strProduct.toLowerCase().replace("\s", "-");
		strPropertyValue = "add-to-cart-"+strTempPropertyValue;
		Hooks.driver.findElement(By.id(strPropertyValue)).click();
	}

	@When ("Click on remove button")
	public void Click_remove_button() {
		strPropertyValue = "remove-"+strTempPropertyValue;
		Hooks.driver.findElement(By.id(strPropertyValue)).click();
	}

	@When ("^Click on \"([^\"]*)\" product title$")
	public void Click_product_title(String strProduct) {
		strProductTitle = strProduct;
		Hooks.driver.findElement(By.xpath("//*[@class='inventory_item_name' and text()='"+strProduct+"']")).click();
	}

	@When ("Click on Back to products")
	public void Click_back_to_products() {
		Hooks.driver.findElement(ElementProperties.backToProducts).click();
	}

	@Then("Verify product added to cart")
	public void Verify_product_added() {
		Hooks.driver.findElement(By.id("shopping_cart_container")).click();
		assert Hooks.driver.findElement(By.xpath("//*[@class='inventory_item_name' and text()='"+strProductTitle+"']")).isDisplayed() == true;
	}

	@Then("Verify product removed from the cart")
	public void Verify_product_removed_from_cart() {
		Hooks.driver.findElement(By.id("shopping_cart_container")).click();
		try {
			Hooks.driver.findElement(By.xpath("//*[@class='inventory_item_name' and text()='"+strProductTitle+"']")).isDisplayed()	;
			assert true == false;
		}catch (Exception e){
			assert true == true;
		}

	}

	@Then("Verify product details page is displayed")
	public void verify_product_details_page_is_displayed() {
		assert Hooks.driver.findElement(ElementProperties.backToProducts).isDisplayed() == true;
	}

	@Then("Verify product matches with the product selected")
	public void Verify_product_title() {
		assert Hooks.driver.findElement(ElementProperties.inventoryDetailsName).getText().equalsIgnoreCase(strProductTitle) == true;
	}
}
