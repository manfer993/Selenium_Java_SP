package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enter extends BaseAction {
	public static void text(WebDriver driver, By locator, String inputText) {
		findElement(driver, locator).clear();
		findElement(driver, locator).sendKeys(inputText);
	}
}
