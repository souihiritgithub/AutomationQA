package com.e2etests.automation.step_definitions;

import java.time.Duration;

import com.e2etests.automation.page_objects.AuthentificationPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;
import com.e2etests.automation.utils.Setup;
import com.e2etests.automation.utils.Validations;
import com.e2etests.automation.utils.Wait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;
	private Validations validations;
	private AuthentificationPage  authentificationPage;
	private Wait wait;
	
	
	public AuthentificationStepDefinition() {
		this.seleniumUtils = new SeleniumUtils();
		this.configFileReader = new ConfigFileReader();
		this.validations = new Validations();
		this.authentificationPage = new AuthentificationPage();
		this.wait = new Wait(Setup.getDriver());
	}
	
	

	@Given("I navigate to OrangeHRM login page")
	public void iLogIntoTheAdminPortalApplication() {
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	 
	}
	@Then("the user should be redirected to the dashboard")
	public void theUserShouldBeRedirectedToTheDashboard() {
		wait.forElementToBeDisplayed(Duration.ofSeconds(20), authentificationPage.validMessage, "NAN");
		validations.assertTrue(AuthentificationPage.validMessage,configFileReader.getProperties("Dashboard.msg") );
	    
	}
	@When("the user clicks the logout button")
	public void theUserClicksTheLogoutButton() {
		wait.forElementToBeDisplayed(Duration.ofSeconds(20), authentificationPage.bouttonUser, "NAN");
		seleniumUtils.click(authentificationPage.bouttonUser);
		wait.forElementToBeDisplayed(Duration.ofSeconds(20), authentificationPage.bouttonLogOut, "NAN");
		seleniumUtils.click(authentificationPage.bouttonLogOut);
		
		
	 
	}
	@Then("the user should be redirected to the login page")
	public void theUserShouldBeRedirectedToTheLoginPage() {
		wait.forElementToBeDisplayed(Duration.ofSeconds(20), authentificationPage.TextAssertPageLogin, "NAN");
		validations.assertTrue(authentificationPage.TextAssertPageLogin, configFileReader.getProperties("AssertMsgPageLogin"));
	
	}




}
