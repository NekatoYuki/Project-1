
public class KKimLib {

//tinyurl.com/Levinmethodmadness
	
//dateStr
	
	public static void dateStr(String str)
	{
		System.out.println (str.substring(3,5) + " - " + str.substring(0,2) + " - " + str.substring(6));
	}

//isFibonnaci
	
	public static boolean isFibonnaci(int num)
	{
		if (num<0) return false;
		else
		{
			int x=0;
			int y=1;
			int z=0;
			while (z<num)
				{
					z=x+y;
					x=y;
					y=z;
				}
			if (num==z) return true;
			else return false;
		}
	}

//vigCipher
	
	public static void vigCipher(String str)
	{
		int a = 0;
	}
}