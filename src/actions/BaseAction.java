package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseAction {
	public static WebElement findElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement findElement(WebElement webElement, By locator) {
		return webElement.findElement(locator);
	}

	public static List<WebElement> findElements(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}
	
	public static List<WebElement> findElements(WebElement webElement, By locator) {
		return webElement.findElements(locator);
	}
	
	public static void getUrl(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static void close(WebDriver driver) {
		driver.quit();
	}
}
