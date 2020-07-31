package ui;

import org.openqa.selenium.By;

public class LoginUI {
	public static By username = By.id("user-name");
	public static By password = By.id("password");
	public static By loginButton = By.id("login-button");
	public static By errorMessage = By.xpath("//h3[@data-test='error']");
}
