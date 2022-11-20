package Primusbank_lib;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Utils.Appusage;

public class AdminLogin extends Appusage
{
	
	public boolean adminlogin(String uid,String upwd)
	     {
		String exp,act;
		exp = "dashboard";
		
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(upwd);
		driver.findElement(By.id("btnLogin")).click();
		act = driver.getCurrentUrl();
		if (act.toLowerCase().contains(exp))
		{
			 return true;
		}else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
