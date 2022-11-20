package Demos;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDrivers {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
	}
	

}
