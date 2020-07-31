package tests;

import org.testng.annotations.*;

import tasks.*;

public class LoginTest extends BaseTest {
	private String user_name = null;
	private String password = null;
	
	@BeforeMethod
	@Parameters({"url","user_name","password"})
	public void setUp(String url, String user_name, String password) {
		this.user_name = user_name;
		this.password = password;
		Util.openBrowser(driver, url);
	}
	@Test
	public void login_test() {
		Login.as(driver, user_name, password);
	}
}
