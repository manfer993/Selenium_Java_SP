package actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetText extends BaseAction {
	public static String on(WebElement element) {
		return element.getText();
	}

	public static String on(WebDriver driver, By locator) {
		return findElement(driver, locator).getText();
	}

	public static String on(WebElement element, By locator) {
		return findElement(element, locator).getText();
	}

	public static List<String> listOn(WebDriver driver, By locator) {
		List<WebElement> elements = findElements(driver, locator);
		List<String> texts = new ArrayList<String>();
		for (int i = 0; i < elements.size(); i++) {
			texts.add(elements.get(i).getText());
		}
		return texts;
	}
}
