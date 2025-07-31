package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import factory.DriverFactory;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginFuncitonality() {
		LoginPage loginPage = new LoginPage(DriverFactory.getInstance().getDriver());
		loginPage.login("Abhimanyu", "password123");

		HomePage homePage = new HomePage(DriverFactory.getInstance().getDriver());
		Assert.assertTrue(homePage.isDashboardDisplayed(), "Dashboard is not visible");

	}

}
