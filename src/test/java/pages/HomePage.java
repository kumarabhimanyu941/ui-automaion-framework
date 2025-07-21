package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementActions;

public class HomePage {

	private WebDriver driver;
	private ElementActions actions;

	// 1)HomePage constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.actions = new ElementActions(driver);

	}

	// 2)HomePage locators

	private By dashboardHeader = By.xpath("//h1[contains(text(),'Dashboard')]");

	public boolean isDashboardDisplayed() {
		return actions.isElementDisplayed(dashboardHeader);
	}

	public String getDashboardText() {
		return actions.getText(dashboardHeader);
	}
}
