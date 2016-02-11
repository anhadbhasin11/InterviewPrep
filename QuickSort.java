import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

	
	public static void sort(int[] array)
	{
		Collections.shuffle(Arrays.asList(array)); //Shuffle in JAVA
		sort(array, 0, array.length-1);
	}
	public static void sort(int[] array, int lo, int hi)
	{
		if(hi<=lo) return;
		int j = partition(array, lo, hi);
		sort(array, lo,j-1);
		sort(array, j+1, hi);
		
	}
	public static int partition(int[] array, int lo, int hi)
	{
		int i = lo;
		int j = hi + 1;
		while(true)
		{
			while(array[++i] < array[lo])
			{
				if(i==hi) break;
			}
			while(array[lo] < array[--j])
			{
				if(j == lo) break;
			}
			if( i >= j) break;
			swap(array,i,j);

		}
		swap(array, lo,j);
		return j;
		
	}
	
	public static void swap(int[] array, int i, int j)
	{
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
	public static void main(String args[])
	{
		int array[] = {8,6,30,20,7,1,9};
		sort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
