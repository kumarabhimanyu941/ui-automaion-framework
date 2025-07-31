package base;

import org.testng.annotations.*;

import factory.DriverFactory;

public abstract class BaseTest {

	protected DriverFactory driverfactory;

	@BeforeMethod
	@Parameters("browser")
	public void setUp(String browser) {

		driverfactory = DriverFactory.getInstance();
		driverfactory.init_driver(browser);

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.getInstance().removeDriver();
	}
}
