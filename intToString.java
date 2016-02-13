
public class intToString {

	public static String convert(int original)
	{
		StringBuilder result = new StringBuilder();
		while (original != 0)
		{
			result.append(original%10);
			original = original/10;
			
		}
		StringBuilder finalResult = new StringBuilder();
		for(int i  = result.length()-1; i >=0; --i)
		{
			finalResult.append(result.charAt(i));
		}
		
		
		
		return finalResult.toString();
	}
	
	public static void main(String args[])
	{
		int i = 12345;
		System.out.println(convert(98765434));
		
	}
}
