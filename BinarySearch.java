
public class BinarySearch {

	public static int Search(int[] array, int key)
	{
		int lo = 0;
		int hi = array.length-1;
		int mid;
		
		while(hi>=lo)
		{
			mid = lo + (hi-lo)/2;
			if(key > array[mid])
				lo = mid + 1;
			else if(key < array[mid])
				hi = mid -1;
			else
				return mid;
				
		}
		return -1;
	}
	public static void main(String args[])
	{
		int[] array = {1,3,5,7,9,10,15,20,100};
		System.out.println(Search(array, 20));
		
	}
}
