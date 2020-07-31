package tasks;

import org.openqa.selenium.WebDriver;

import actions.*;

public class Util {
	public static WebDriver setUp(WebDriver driver) {
		WebDriver myDriver = GetBrowser.chrome(driver);
		Wait.implicitly(myDriver);
		return myDriver;
	}
	
	public static void close(WebDriver driver) {
		BaseAction.close(driver);
	}
	
	public static void openBrowser(WebDriver driver, String url) {
		BaseAction.getUrl(driver, url);
	} 
}
