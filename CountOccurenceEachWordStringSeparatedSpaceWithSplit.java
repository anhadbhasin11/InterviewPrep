import java.util.HashMap;

public class CountOccurenceEachWordStringSeparatedSpaceWithSplit {

	
	public static String countOcurences(String original)
	{
		StringBuilder result =  new StringBuilder();
		String array[] = original.split(" ");
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		for(int i =0; i < array.length; i++)
		{
			if(hash.get(array[i]) != null && hash.get(array[i]) > 0)
				hash.put(array[i],hash.get(array[i]) + 1);
			else
				hash.put(array[i],1);
		}
		for(String key : hash.keySet())
		{
			result.append(key + "-" + hash.get(key) + " ");
		}
		
		return result.toString();
	}
	public static void main(String args[])
	{
		String a = "I I I am Anhad am am Singh and I am boy";
		System.out.println(countOcurences(a));
		
	}
}
