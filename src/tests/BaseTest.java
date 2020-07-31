package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import tasks.Util;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = Util.setUp(driver);
	}
	
	@AfterClass
	public void tearDown() {
		Util.close(driver);
	}
}
