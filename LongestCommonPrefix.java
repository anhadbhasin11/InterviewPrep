
public class LongestCommonPrefix {

	public static String commonPrefix(String string1, String string2)
	{
		StringBuilder result = new StringBuilder();
		int minLength = Math.min(string1.length(), string2.length());
		for(int i = 0; i < minLength; i ++)
		{
			if(string1.charAt(i) == string2.charAt(i))
			{
				result.append(string1.charAt(i));
			}
		}
		return result.toString();
	}
	public static void main(String args[])
	{
		System.out.println(commonPrefix("original","Originate"));
		
		
		
	}
}
