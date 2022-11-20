package javademo;

public class Demotest
{

	public static void main(String[] args) 
	{

		//Possible values are "s" or "q" or "l" or any other char
		
		String course="x";
		
		switch (course.toLowerCase()) 
		{
		   case "s":
			   System.out.println("SELENIUM");
			   break;
		   case "q":
			   System.out.println("QTP");
			   break;
		   case "l":
			   System.out.println("LoadRunner");
			   break;
		   default:
			   System.out.println("Invalid Course");
			   break;		
		}
		
		
		
	}

}
