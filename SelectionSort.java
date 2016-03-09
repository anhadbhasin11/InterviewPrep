import java.lang.reflect.Array;

/*
 * Selection Sort is one of the easiest way to sort.
 * Time Complexity : O(n^2)
 * Space Complexity : O(1)
 * In Place :  Yes
 * 
 * In iteration i, find index of smallest remaining entry and Swap a[i] and a[min].
 * 
 * Anhad S Bhasin
 */
public class SelectionSort {
	
	public static void sort(int[] array)
	{
		for(int i = 0; i < array.length; ++i)
		{
			if(array[i] > array[minimum(array,i)])
				swap(array,i,minimum(array,i));
		}
	}
	
	private static int minimum(int[] array, int i)
	{
		
		
		int min = i;
		for(int j = i; j < array.length; ++j)
		{
			if(array[j] < array[min])
				min = j;
		}
		return min;
	}
	private static void swap (int[] array, int x, int y)
	{
		int swap = array[x];
		array[x] = array[y];
		array[y] = swap;
	}
	
	
	public static void main(String args[])
	{
		int[] array = {0,900, 9,8,5,4,7,1,2,50,100,1,6};
		sort(array);
		for(int i = 0; i < array.length; ++i)
			System.out.println(array[i]);
		
		
	}
	

}
