package com.e2etests.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @Omar ben Lellahom Class Wait.
 */
public class Wait {

	/** driver. */
	private WebDriver driver;

	/**
	 * Instanciation de wait.
	 *
	 * @param driver
	 */
	public Wait(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * methode Wait until condition.
	 *
	 * @param condition
	 * @param timeoutMessage
	 * @param timeout
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void waitUntilCondition(ExpectedCondition condition, String timeoutMessage, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.withMessage(timeoutMessage);
		wait.until(condition);
	}

	/**
	 * methode For element to be displayed.
	 *
	 * @param timeout
	 * @param webElement
	 * @param webElementName
	 */
	public void forElementToBeDisplayed(Duration timeout, WebElement webElement, String webElementName) {
		ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOf(webElement);
		String timeoutMessage = webElementName + " wasn't displayed after " + timeout + " seconds.";
		waitUntilCondition(condition, timeoutMessage, timeout);
	}

}
