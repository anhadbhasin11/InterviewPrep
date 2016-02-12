
public class ReverseString {

	public static String reverse(String original)
	{
		StringBuilder result = new StringBuilder();
		char[] characters = original.toCharArray();
		for(int i = original.length() - 1; i >= 0; --i)
		{
			result.append(characters[i]);
		}
		
		return result.toString();
	}
	public static void main(String args[])
	{
		
		System.out.println(reverse("Hola Amigo"));
	}
}
