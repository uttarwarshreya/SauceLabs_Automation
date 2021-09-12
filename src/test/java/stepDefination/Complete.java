package stepDefination;

import io.cucumber.java.en.*;

public class Complete {
	@When("Click on Back Home button from Checkout:Complete page")
	public void click_on_back_home_button_from_checkout_complete_page() {
		Hooks.driver.findElement(ElementProperties.backToProducts).click();
	}
}
