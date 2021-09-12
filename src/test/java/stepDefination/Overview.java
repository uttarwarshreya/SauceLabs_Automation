package stepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.*;

public class Overview {

	@When("Click on cancel button from Checkout page")
	public void click_on_cancel_button_from_checkout_page() {
	    Hooks.driver.findElement(ElementProperties.cancelButton).click();
	}
	
	@When("Click on finish button from Checkout page")
	public void click_on_finish_button_from_checkout_page() {
		Hooks.driver.findElement(ElementProperties.finishButton).click();
	}

	@When("Click on product title from overview page")
	public void Click_product_title_from_overview_page() {
		Hooks.driver.findElement(By.xpath("//*[@class='inventory_item_name' and text()='"+Product.strProductTitle+"']")).click();
	}
	
		
	@Then("Order confirmation page should be displayed")
	public void order_confirmation_page_should_be_displayed() {
	    assert Hooks.driver.findElement(ElementProperties.completeHeader).getText().equalsIgnoreCase("THANK YOU FOR YOUR ORDER") == true;
	}
	
	@Then("Verify the details like product, payment information, Shipping information, Total amount fields")
	public void verify_the_details_like_product_payment_information_shipping_information_total_amount_fields() {
		assert Hooks.driver.findElement(ElementProperties.inventoryItemName).getText().equalsIgnoreCase(Product.strProductTitle) == true;
		assert Hooks.driver.findElement(ElementProperties.summaryInfo1).getText() != null;
		assert Hooks.driver.findElement(ElementProperties.summaryInfo2).getText() != null;
	}
}
