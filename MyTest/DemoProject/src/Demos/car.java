package Demos;

public class car 
{
	
	String name;
	String color;
	double price;
	static int weels=4;
	
	
	
	public static void startcar(String name)
	{
		System.out.println(name+"Car is started...");
	}
	public void sportdrive()
	{
		System.out.println("Sport drive is invoked..");
	}
	public static void stopcar(String name)
	{
		System.out.println(name +"car is stoped..");
	}
	public void color()
	{
		System.out.println("Red");
	}
}
