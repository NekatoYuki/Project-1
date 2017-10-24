//Daniel Li
//Method Madness Project

public class DLiLib 
{
	public static void isPalindrome(String word)
	{
		int y=1;
		int length= word.length();
		if(length<2)
			System.out.println("true");
		
		for(int x=0;x<length/2;x++)
		{
			if(word.charAt(x)!=word.charAt(length-y))
			{
				y++;
				boolean f=false;
				System.out.println(f);
				System.exit(0);
				
			}
				
		}
		
		boolean f=true;
		System.out.println(f);
		
				
	}
	
	public static void sumUpTo(int x)
	{
		int d=((x*x)+x)/2;
		System.out.println(d);
	}
	
	public static void quadraticSolver(int a, int b, int c)
	{
		
		if(b*b<4*a*c)
		{
			System.out.println("There are no real roots for this quadratic.");
		}
		
		if(b*b==4*a*c)
		{
			double root = (-1*b)/(2*a);
			System.out.println("The root of this quadratic is "+root);
		}
		
		if(b*b>4*a*c)
		{
			double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		    double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
		    System.out.println("The roots of this quadratic is "+root1+" and "+root2);
		}
	}

}
