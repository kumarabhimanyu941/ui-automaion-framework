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

	public void click(By locator) {
		waitUtil.waitForElementClickable(locator).click();
	}

	public void sendKeys(By locator, String text) {
		WebElement element = waitUtil.waitForElementVisible(locator);
		element.clear();
		element.sendKeys(text);
	}

	public String getText(By locator) {
		return waitUtil.waitForElementVisible(locator).getText();

	}

	public void selectByVisibleText(By locator, String text) {
		Select select = new Select(waitUtil.waitForElementVisible(locator));
		select.selectByVisibleText(text);

	}

}
