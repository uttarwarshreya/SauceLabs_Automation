package stepDefination;

import org.openqa.selenium.By;

import io.cucumber.java.en.*;

public class Overview {

	@When("Click on cancel button from Checkout page")
	public void click_on_cancel_button_from_checkout_page() {
	    Hooks.driver.findElement(By.id("cancel")).click();
	}
	
	@When("Click on finish button from Checkout page")
	public void click_on_finish_button_from_checkout_page() {
		Hooks.driver.findElement(By.id("finish")).click();
	}

	@When("Click on product title from overview page")
	public void Click_product_title_from_overview_page() {
		Hooks.driver.findElement(By.xpath("//*[@class='inventory_item_name' and text()='"+Product.strProductTitle+"']")).click();
	}
	
		
	@Then("Order confirmation page should be displayed")
	public void order_confirmation_page_should_be_displayed() {
		System.out.println( Hooks.driver.findElement(By.xpath("//*[@class='complete-header']")).getText());
	    assert Hooks.driver.findElement(By.xpath("//*[@class='complete-header']")).getText().equalsIgnoreCase("THANK YOU FOR YOUR ORDER") == true;
	}
	
	@Then("Verify the details like product, payment information, Shipping information, Total amount fields")
	public void verify_the_details_like_product_payment_information_shipping_information_total_amount_fields() {
		assert Hooks.driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText().equalsIgnoreCase(Product.strProductTitle) == true;
		assert Hooks.driver.findElement(By.xpath("//div[@class='summary_info']//div[2]")).getText() != null;
		assert Hooks.driver.findElement(By.xpath("//div[@class='summary_info']//div[4]")).getText() != null;
	}
}
