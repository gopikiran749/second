package Primusbank_lib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.Appusage;

public class out extends Appusage

{

	@Test
	public  void logout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
	
}
