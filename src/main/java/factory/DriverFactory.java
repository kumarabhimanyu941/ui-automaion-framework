
package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;
import java.time.Duration;
import java.util.Locale;

public class DriverFactory {

	// 1)Private static instance of the class
	private static volatile DriverFactory instance;
	private static BrowserDriverFactory browserfactory;

	private static ThreadLocal<WebDriver> tldriver = new ThreadLocal();

	// 2)private constructor of the class

	private DriverFactory() {
	};

	// 3)Public getter method that will act as global access point to get the
	// instance of the class

	public static DriverFactory getInstance() {
		if (instance == null) {
			synchronized (DriverFactory.class) {
				if (instance == null) {
					instance = new DriverFactory();
				}
			}
		}
		return instance;
	}

	public static ThreadLocal<WebDriver> init_driver(String browser) {

		switch (browser.toLowerCase(Locale.ROOT)) {

		case "chrome":
			browserfactory = new ChromeDriverManager();
			break;
		case "firefox":
			browserfactory = new FirefoxDriverManager();
		default:
			throw new IllegalArgumentException("Invalid browser name.");

		}

		tldriver.set(browserfactory.createdriver());
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().manage().window().maximize();
		getDriver().get(ConfigReader.get("url"));
		return tldriver;

	}

	public static WebDriver getDriver() {
		return tldriver.get();
	}

	public static void removeDriver() {
		getDriver().quit();
		tldriver.remove();
	}

}