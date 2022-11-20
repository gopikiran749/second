package jqueryui_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jque_Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\MyTest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com");
		
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source,target;
		source = driver.findElement(By.id("draggable"));
		target = driver.findElement(By.id("droppable"));
		Actions act =new  Actions(driver);
		act.dragAndDrop(source, target);
		act.build().perform();
		}

}
