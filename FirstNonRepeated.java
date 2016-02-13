import java.util.HashMap;

public class FirstNonRepeated {

	public static char nonRepeated(String original)
	{
		char c = ' ';
		Object single = new Object();
		Object multiple = new Object();
		HashMap<Character, Integer> hash = new 	HashMap<Character, Integer>();
		
		for(int i = 0; i < original.length(); i ++)
		{
			//System.out.println(hash.get(original.charAt(i)));
			if(hash.containsKey(original.charAt(i)))
				hash.put(original.charAt(i), hash.get(original.charAt(i)) + 1);
			else
				hash.put(original.charAt(i), 1);
		}
		
		for(int i = 0; i < original.length(); i++)
		{
			//System.out.println(hash.get(original.charAt(i)));
			if(hash.get(original.charAt(i)) == 1)
				{
				c = original.charAt(i);
				break;
				}
		}
		
		
		return c;
	}
	public static void main(String args[])
	{
		System.out.println(nonRepeated("toatal"));
	}
	
}
