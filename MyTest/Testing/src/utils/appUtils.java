package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class appUtils {

	public static WebDriver driver;
	public static void lanchApp(String url)
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	public static void closeAPP()
	{
		driver.close();
	}
}
