package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOnTable {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/tools/forex");
		WebElement table = driver.findElement(By.className("dataTable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		List<WebElement> col = rows.get(1).findElements(By.tagName("td"));
		String cooo =  col.get(0).getText();
		
	
}
}
