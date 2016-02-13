
public class RemoveCharacters {

	public static String removeChars(String original, String removal)
	{
		StringBuilder result = new StringBuilder(); 
		boolean[] flags = new boolean[128];
		for(int i = 0; i < removal.length(); i ++)
		{
			flags[removal.charAt(i)] = true;
		}
		for(int i  = 0; i < original.length(); i++)
		{
			if(!flags[original.charAt(i)])
			{
				result.append(original.charAt(i));
			}
		}
		
		
		
		return result.toString();
	}
	public static void main(String args[])
	{
		System.out.println(removeChars("abc def ghi jkl mno qrst uvwxyz", "zaefg"));
	}
}
