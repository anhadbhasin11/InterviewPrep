
public class ArrayOfSuffixes {

	public static String[] arraySuffix(String original)
	{
		String array[] = new String[original.length()];
		
		for(int i = original.length()-1,j=0; i>=0; --i,j++)
		{
			array[j] = original.substring(i, original.length());
		}
		return array;
	}
	public static void main(String args[])
	{
		String array[] = arraySuffix("Original");
		for(int i = 0; i < array.length; i ++)
		{
			System.out.println(array[i]);
		}
	}
}
