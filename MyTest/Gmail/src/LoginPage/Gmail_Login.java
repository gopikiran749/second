package LoginPage;

import org.openqa.selenium.By;

import gmail_Utils.Gmail_Page;

public class Gmail_Login extends Gmail_Page

{
	public  void Login(String uid,String pwd) 
	
	
	{
		driver.findElement(By.id("identifierId")).sendKeys(uid);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]")).click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
