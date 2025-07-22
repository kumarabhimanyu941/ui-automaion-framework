package base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import factory.DriverFactory;

import utils.ConfigReader;

public abstract class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void setUp(@Optional String browser) {
		String browserToUse;
		if (browser != null) {
			browserToUse = browser;
		} else {
			browser = ConfigReader.get("browser");
		}
		driver = DriverFactory.init_driver(browser);
		driver.get(ConfigReader.get("baseUrl"));
	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}
