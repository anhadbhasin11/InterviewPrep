
public class InsertionSort {

	public static void Sort(int[] array)
	{
		for(int i = 1; i < array.length; i++ )
		{
			for(int j = i; j > 0; j--)
			{
				if(array[j] < array[j-1])
					swap(array, j, j-1);
			}
			
		}
	}
	private static void swap(int[] array, int x, int y)
	{
		int swap = array[x];
		array[x] = array[y];
		array[y] = swap;
	}
	
	public static void main(String args[])
	{
		int[] array = {5,2,1,6,8,10, 50, 100, 50, 0};
		Sort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
