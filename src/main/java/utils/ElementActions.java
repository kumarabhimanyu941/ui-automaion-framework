package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementActions {

	private WebDriver driver;
	private WaitUtils waitUtil;

	public ElementActions(WebDriver driver) {
		this.driver = driver;
		waitUtil = new WaitUtils(driver);
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = waitUtil.waitForElementVisible(locator);
		} catch (Exception e) {
			System.out.println("Error occurred while locating the element " + locator);
			System.out.println("Error" + e.getMessage());
			throw e;
		}
		return element;
	}

	public void click(By locator) {
		getElement(locator).click();
	}

	public void click(WebElement element) {
		element.click();
	}

	public void sendKeys(By locator, String text) {
		WebElement element = getElement(locator);
		element.clear();
		element.sendKeys(text);
	}

	public String getText(By locator) {
		return getElement(locator).getText();

	}

	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public void selectByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}

}
