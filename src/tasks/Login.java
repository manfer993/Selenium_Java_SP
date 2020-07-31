package tasks;

import org.openqa.selenium.WebDriver;
import ui.LoginUI;
import actions.*;

public class Login {
	public static void as(WebDriver driver, String user, String password) {
		Enter.text(driver, LoginUI.username, user);
		Enter.text(driver, LoginUI.password, password);
		Click.on(driver, LoginUI.loginButton);
	}
}
