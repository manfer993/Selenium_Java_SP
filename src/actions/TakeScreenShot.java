package actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {

	public static String base64(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

	public static void image(WebDriver driver, String name, String directory) {
		String date = dateByFormat("ddMMyyyy_HHmmss");
		String complementPath = "/" + directory + "/" + date + "_" + name + ".png";
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			String basePath = new File(System.getProperty("user.dir")).getAbsolutePath() + "/test-output";
			File destFile = new File((String) basePath + complementPath);
			FileUtils.copyFile(scrFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String dateByFormat(String format) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat(format);
		return formater.format(calendar.getTime());
	}

}
