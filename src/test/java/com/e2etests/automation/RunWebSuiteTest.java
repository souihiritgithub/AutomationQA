package com.e2etests.automation;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty","html:target/cucumber-repport.html"},
		tags = "@Test",
		monochrome = true,
		snippets = CAMELCASE
		

		)

public class RunWebSuiteTest {
	
	

}
