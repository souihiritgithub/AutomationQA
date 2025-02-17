package com.e2etests.automation.utils;

import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
@OmarBenlellahom
 * This class is used to perform various kinds of validations in the test cases.
 */
public class Validations extends BasePage {

	/** testCaseStatus the status of the test case. */
	boolean testCaseStatus = true;
	

	/** test status. */
	boolean testStatus;

	/** test screenshot dir. */
	private String testScreenshotDir;

	private WebDriver driver;

	/**
	 * Instanciation de assertions.
	 */
	public Validations() {
		super();
		this.driver = Setup.getDriver();
	}

	/**
	 * method verify element is present.
	 */
	

	public void assertTrue(WebElement element, String text) {
		String text1 = element.getText();
		Assert.assertTrue(text1.contains(text));

	}






}
