
public class KKimLib {

//tinyurl.com/Levinmethodmadness
	
//dateStr
	
	public static void dateStr(String str)
	{
		System.out.println (str.substring(3,5) + " - " + str.substring(0,2) + " - " + str.substring(6)); // order is simply rewritten which a dash included
	}

//isFibonnaci
	
	public static void isFibonnaci(int num)
	{
		if (num<0) System.out.println(false);
		else
		{
			int x=0; //first number
			int y=1; //second number
			int z=0; //sum of both numbers
			while (z<num)
				{
					z=x+y; //sum is calculated
					x=y; //second becomes first number
					y=z; //sum becomes second number
				}
			if (num==z) System.out.println (true);
			else System.out.println (false);
		}
	}

//multiplicationTable
	
	public static void multiplicationTable(int a, int b)
	{
		int c = 0; //counter starting from 0 up to int b
			while (c<b)
			{
				int d = a*c; //product
				System.out.print(d + ", "); //prints product
				c++; //counter up by 1
			}
		System.out.println(a*b); //prints final product
	}
}