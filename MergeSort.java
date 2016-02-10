
public class MergeSort {
	
	static int aux[];
	
	public static void sort(int[] array)
	{
		aux = new int[array.length];
		sort(array, aux, 0, array.length-1);
	}
	public static void merge(int[] array, int[] aux, int lo, int mid, int hi)
	{
		for(int i = 0; i < array.length; ++i)
		{
			aux[i] = array[i];
		}
		int i = lo;
		int j = mid+1;
		for(int k = lo; k <= hi; k++)
		{
			
			if (i > mid) array[k] = aux[j++];
			else if (j > hi) array[k] = aux[i++];
			else if (aux[i] > aux[j]) array[k] = aux[j++];
			else array[k] = aux[i++];
				
		}
	}
	public static void sort(int[] array, int[] aux, int lo, int hi)
	{
		if(hi<=lo) return;
		int mid = lo + (hi-lo)/2;
		sort(array, aux, lo, mid);
		sort(array, aux, mid+1, hi);
		merge(array, aux, lo, mid, hi);
	}
	
	public static void main(String args[])
	{
		int[] array = {5,6,3,2,7,9,10,1,0};
		sort(array);
		for(int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
	}
}
