package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AuthentificationPage {

	@FindBy(how = How.ID, using = "mat-input-0")
	public static WebElement Email;

	@FindBy(how = How.ID, using = "mat-input-1")
	public static WebElement Password;

	@FindBy(how = How.XPATH, using = "//button[@class='block primary']")
	public static WebElement bouttonSignIn;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Welcome To Dashboard')]")
	public static WebElement validMessage;

	@FindBy(how = How.XPATH, using = "//img[@src='assets/images/user.svg']")
	public static WebElement bouttonUser;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Logout']")
	public static WebElement bouttonLogOut;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Sign In')]")
	public static WebElement TextAssertPageLogin;
	
	
	
	

	public AuthentificationPage() {
		PageFactory.initElements(Setup.driver, this);
	}

}
