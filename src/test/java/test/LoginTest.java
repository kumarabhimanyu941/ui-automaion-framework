package test;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginFuncitonality() {
		LoginPage login = new LoginPage(driver);
		login.enterusername("Abhimanyu");
		login.enterpassword("pass123");
		login.clickLogin();
	}

}
