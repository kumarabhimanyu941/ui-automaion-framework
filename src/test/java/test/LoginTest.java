package test;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginFuncitonality() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Abhimanyu","password123");
	}

}
