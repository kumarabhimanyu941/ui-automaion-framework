package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class ChromeDriverManager implements BrowserDriverFactory {

	@Override
	public WebDriver createdriver() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		if (Boolean.parseBoolean(ConfigReader.get("headless"))) {
			options.addArguments("--headless=new");
		}

		return new ChromeDriver(options);
	}

}
