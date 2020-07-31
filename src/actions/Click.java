package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click extends BaseAction {
	public static void on(WebDriver driver, By locator) {
		findElement(driver, locator).click();
	}
	
	public static void on(WebElement webElement, By locator) {
		findElement(webElement, locator).click();
	}
}
