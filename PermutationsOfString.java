
public class PermutationsOfString {

	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private final String in;
	public PermutationsOfString(final String str)
	{
		in = str;
		used = new boolean[in.length()];
	}
	public void permute()
	{
		if(out.length() == in.length())
		{
			System.out.println(out);
			return;
		}
		for(int i = 0; i < in.length(); ++i)
		{
			if( used[i]) continue;
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}
	
	public static void main(String args[])
	{
		PermutationsOfString perm = new PermutationsOfString("abcd");
		perm.permute();
	}
}
