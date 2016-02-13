
public class stringToInt {
	
	public static int convert(String original)
	{
		int result = 0;
	
		for(int i = original.length() , j = 1; i > 0; --i, j = j * 10)
		{
			result = result + (j * Integer.parseInt(original.substring(i-1, i)));		
		}
		
		return result;
	}
	
	public static void main(String args[])
	{
		System.out.println(convert("123459876"));
	}

}
