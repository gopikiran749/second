package Drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Pack/chromedriver.exe");   
		WebDriver drive=new ChromeDriver();
		drive.get("https://google.com");
		drive.navigate().to("https://facebook.com");



	}

}
