package stepDefination;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks {

	public static WebDriver driver = null;
	ElementProperties eleProp;
	@Before
	public void beforeScenario(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		eleProp = new ElementProperties(driver);
	}	

	@AfterStep
	public void captureScreenshot(Scenario scenario) throws IOException {
		scenario.attach(GenericFunctions.getScreenshot(), "image/png", "");
	}

	@After
	public void afterScenario(){
		driver.close();
	}
}
