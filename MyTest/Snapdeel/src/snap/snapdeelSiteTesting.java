package snap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import javafx.event.ActionEvent;

public class snapdeelSiteTesting {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://snapdeal.com");
		Actions act  = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[11]/a/span")));
		act.build().perform();
	}

}
