package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validate extends BaseAction {

	public static Boolean isEnabled(WebDriver driver, By locator) {
		try {
			return findElement(driver, locator).isEnabled();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static Boolean isSelected(WebDriver driver, By locator) {
		try {
			return findElement(driver, locator).isSelected();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public static Boolean isDisplayed(WebDriver driver, By locator) {
		try {
			return findElement(driver, locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}
