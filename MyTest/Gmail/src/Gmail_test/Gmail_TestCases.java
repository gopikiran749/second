package Gmail_test;

import org.testng.annotations.Test;

import gmail_Utils.Gmail_Page;

public class Gmail_TestCases 


{
	@Test
	public static void lanchmail() throws InterruptedException
	{
		Gmail_Page.Mail_launch("https://gmail.com");
		Thread.sleep(5000);
		Gmail_Page.mail_close();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
