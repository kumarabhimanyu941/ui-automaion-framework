package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class FirefoxDriverManager implements BrowserDriverFactory {

	@Override
	public WebDriver createdriver() {

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		if (Boolean.parseBoolean(ConfigReader.get("headless"))) {

			options.addArguments("--headless");
		}
		return new FirefoxDriver(options);
	}

}
