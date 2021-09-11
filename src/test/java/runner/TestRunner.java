package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features" ,
		glue= {"stepDefination"},
		//tags = "@SmokeTest",
		monochrome = true , 
		plugin = {"pretty","html:target/cucumber-reports/reports.html","json:target/cucumber.json","junit:target/cucumber-reports/reports.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)



public class TestRunner {

}