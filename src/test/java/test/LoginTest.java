package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginFuncitonality() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Abhimanyu", "password123");

		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isDashboardDisplayed(), "Dashboard is not visible");

	}

}
