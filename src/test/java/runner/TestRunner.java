package runner;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import managers.FileReaderManager;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,glue= {"stepDefination"},
monochrome = true , 
plugin = {"pretty","html:target/cucumber-reports/reports.html","json:target/cucumber.json","junit:target/cucumber-reports/reports.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

//plugin = {"pretty","com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
		)



public class TestRunner {
	
}
