
public class SortArrayEvenOdd {

	public static void sort(int[] array)
	{
		int start = 0;
		int end = array.length - 1;
		int[] newArray = new int[array.length];
		for(int i  = 0; i < array.length; i++)
		{
			if(	array[i] % 2 == 0 )
			{
				newArray[start++] = array[i]; 
			}
			else
			{
				newArray[end--] = array[i];
			}
		}
		
		
		for(int i =0; i < array.length; i ++)
		{
			array[i] = newArray[i];
		}
	}
	
	public static void main(String args[])
	{
		int[] array = {5,6,8,2,4,1,3,0};
		for(int i : array )
			System.out.print(i + " ");
		
		System.out.println();
		sort(array);
		for(int i : array )
			System.out.print(i + " ");
	}
}
