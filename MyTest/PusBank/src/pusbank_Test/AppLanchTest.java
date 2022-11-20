package pusbank_Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Primusbank_lib.AdminLogin;
import Utils.Appusage;
import javafx.scene.control.Alert;

public class AppLanchTest extends Appusage
{
	@Test
	public static void app()
	{
		Appusage.application("http://orangehrm.qedgetech.com/");
		
	
	}
	@Test
	public void bogin() throws InterruptedException
	{
		AdminLogin login =new AdminLogin();
		boolean res = login.adminlogin("Admin", "Qedge123!@#");
		Assert.assertTrue(res);
		
		Thread.sleep(5000);
		
	}
	
	
	
	
	@Test
	public static void close()
	{
		Appusage.closeApplication();
	}
	
}