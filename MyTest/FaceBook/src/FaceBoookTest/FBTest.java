package FaceBoookTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FBTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		Select dlist = new Select(driver.findElement(By.id("day")));
		
		dlist.selectByVisibleText("15");
        Select dlist2 = new Select(driver.findElement(By.id("month")));
		
		dlist2.selectByVisibleText("Aug");
        Select dlist3 = new Select(driver.findElement(By.id("year")));
		
		dlist3.selectByVisibleText("2020");
		

	}

}
