package com.e2etests.automation.utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.cucumber.java.Before;

public class Setup {

	public static WebDriver driver;
	/**
	 * This method is used to open browser. This method is called before the
	 * invocation of each test method in the given class. In this method we need to
	 * pass browser name which will invoke the respective driver.
	 *
	 * @throws MalformedURLException the malformed URL exception
	 * @Before Methods annotated with @Before will execute before every scenario.
	 */
	@Before
	public void SetWebDriver() {

		String browser = System.getProperty("browser");
		if (browser == null) {
			browser = "chrome";
			
		}
		switch (browser) {
		case "chrome":
			ChromeOptions chromeoptions = new ChromeOptions();
			driver = new ChromeDriver(chromeoptions);
			driver.manage().window().maximize();
			break;
		case "firefox":
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions firefoxoption = new FirefoxOptions();
			firefoxoption.setCapability("platform", Platform.WIN10);
			firefoxoption.setProfile(profile);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported");

		}

	}
public static WebDriver getDriver() {
	return driver;
}
}
