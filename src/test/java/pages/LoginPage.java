package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1)private Page Locators
	private By username = By.id("username");
	private By password = By.id("password");
	private By loginBtn = By.id("login");

	// 2)Construtor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3)public Page Actions

	public void enterusername(String user) {
		driver.findElement(username).sendKeys(user);

	}

	public void enterpassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}
}
