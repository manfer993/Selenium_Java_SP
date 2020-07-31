package tasks;

import org.openqa.selenium.WebDriver;

import actions.*;

public class Util {
	public static WebDriver setUp(WebDriver driver) {
		Wait.implicitly(driver);
		return GetBrowser.chrome(driver);
	}
	
	public static void close(WebDriver driver) {
		BaseAction.close(driver);
	}
	
	public static void openBrowser(WebDriver driver, String url) {
		BaseAction.getUrl(driver, url);
	} 
}
