
package factory;

import java.time.Duration;

import org.bouncycastle.crypto.RuntimeCryptoException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import utils.ConfigReader;

public class DriverFactory {

	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal();

	public static WebDriver init_driver(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			Boolean isHeadless = Boolean.parseBoolean(ConfigReader.get("headless"));

			if (isHeadless) {
				options.addArguments("--headless=new");
			}
			tldriver.set(new ChromeDriver(options));
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			Boolean isHeadless = Boolean.parseBoolean(ConfigReader.get(browser));
			FirefoxOptions options = new FirefoxOptions();

			if (isHeadless) {
				options.addArguments("--headless");
			}
			tldriver.set(new FirefoxDriver(options));
		}

		else {
			throw new RuntimeException("Unsupported browser :" + browser);
		}

		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		return getDriver();

	}

	public static WebDriver getDriver() {
		return tldriver.get();
	}

	public static void quitDriver() {
		getDriver().quit();
		tldriver.remove();

	}

}
