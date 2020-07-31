package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetBrowser {
	public static WebDriver chrome(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.addArguments("--disable-gpu");
		options.addArguments("--verbose");
		driver = new ChromeDriver(options);
		return driver;
	}
}
