package Drive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v104.webaudio.WebAudio;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./Pack/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
				
	}

}
