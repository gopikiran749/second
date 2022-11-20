package demosNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NG_Annaotations_Demo {

	@Test(priority=0)
	public void Test1()
	{
		System.out.println("Test one is passed");
	}
	@Test(priority=1)
	public void Test2()
	{
		System.out.println("Test two is pass");
	}
	/*@BeforeTest
	public void login()
	{
		System.out.println("Login");
	}
	@AfterTest
	public void Logout()
	{
		System.out.println("Logout");
	}
	*/
	
	@BeforeMethod
	public void login2()
	{
		System.out.println("Login2");
	}
	
	@AfterMethod
	public void Logout2()
	{
		System.out.println("Logout2");
	}
}
