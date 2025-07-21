package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private static Properties prop;

	public static Properties init_properties() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
		} catch (IOException e) {
			System.out.println("Error loading the config file");
			e.printStackTrace();
		}

		return prop;
	}

	public static String get(String property) {
		if (prop == null) {
			init_properties();
		}
		return prop.getProperty(property);
	}

}
