import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

	public static int[] twoSumHash(int[] nums, int target)
	{
		int[] result = new int[2];
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		
		for(int i = 0; i < nums.length; i++)
		{
			if(hash.get(target - nums[i]) != null)
			{
				result[1] = i;
				result[0] = hash.get(target - nums[i]);
			}
			else
				hash.put(nums[i], i);
		}
		
		return result;
	}
	
	
	
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        int[] result = new int[2];
	        
	        for(int i = 0; i < nums.length; i++)
	        {
	            int expectedValue = target - nums[i];
	            
	            for(int j = 0; j < nums.length; j++)
	            {
	                if(nums[j] == expectedValue)
	                {
	                    result[0] = j;
	                    result[1] = i;
	                }
	            }
	        }
	        return result;
	        
	    }
	 public static void main(String args[])
	 {
		 int[] array = {2, 7, 11, 15};
		 
		 int result[] = TwoSum.twoSumHash(array, 9);
		 
		 for(int x : result)
			 System.out.println(x);
	 }
}
