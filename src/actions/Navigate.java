package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Navigate {
	public static void to(WebDriver driver, String url) {
		driver.navigate().to(url);
	}
	
	public static void back(WebDriver driver) {
		driver.navigate().back();
	}
	
	public static void scroll(WebDriver driver, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + value + ")", "");
	}
}
