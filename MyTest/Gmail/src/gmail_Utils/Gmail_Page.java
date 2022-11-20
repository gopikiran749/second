package gmail_Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Gmail_Page {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public static void Mail_launch(String url)
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	@AfterTest
	public static void mail_close()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
