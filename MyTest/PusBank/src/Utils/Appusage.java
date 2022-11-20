package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Appusage 
{
	public static WebDriver driver;
	
	
	public static void application(String url)
	{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get(url);
	}
	
	public static void closeApplication()
	{
		driver.close();
	}
	
	
}
