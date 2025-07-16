package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementActions;

public class LoginPage {

	private WebDriver driver;
	private ElementActions actions;

	// 1)private Page Locators
	private By usernameField = By.id("username");
	private By passwordField = By.id("password");
	private By loginBtn = By.id("login");

	// 2)Constructor

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		actions = new ElementActions(driver);
	}

	// 3)public Page Actions

	
public void login(String username, String password) {
		actions.sendKeys(usernameField, username);
		actions.sendKeys(passwordField, password);
		actions.click(loginBtn);
	}
}
