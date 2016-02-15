
public class FactorialRecursion {

	public static int calculateFactorial(int number)
	{
		if(number == 1)
			return 1;
		else
			return number * calculateFactorial(number - 1);
	}
	
	
	public static void main(String args[])
	{
		System.out.println(calculateFactorial(5));
	}
}
