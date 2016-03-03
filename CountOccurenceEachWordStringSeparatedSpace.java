import java.util.HashMap;

public class CountOccurenceEachWordStringSeparatedSpace {

	
	public static String countOccurences(String orig)
	{
		StringBuilder result = new StringBuilder();
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		int start = 0, end = -1;
		String original = orig + " ";
		
		for(int i =1; i < original.length(); i++)
		{
			if(original.charAt(i) == ' ')
			{	
				start = end + 1;
				end = i;
				
				if(hash.get(original.substring(start,end)) != null && hash.get(original.substring(start,end)) > 0)
					hash.put(original.substring(start,end), hash.get(original.substring(start,end))  + 1);
				else
					hash.put(original.substring(start,end), 1);
			}			
		}
		
		for (String key : hash.keySet()) 
		{
			result.append(key + "=" + hash.get(key) + " " );
		}
			
		return result.toString();
	}
	public static void main(String args[])
	{
		String a = "I I I am Anhad am am Singh and I am boy";
		
		System.out.println(countOccurences(a));
	
		
		
	}
}
