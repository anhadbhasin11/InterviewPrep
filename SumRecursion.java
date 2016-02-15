
public class SumRecursion {

	public static int calculateSum(int n)
	{
		if(n == 1)
			return 1;
		else
			return n + calculateSum(n - 1);
	}
	
	public static void main(String args[])
	{
		System.out.println(calculateSum(1));
	}
}
