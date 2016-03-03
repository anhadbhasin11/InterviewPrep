
public class MaximumSubArray {

	 public static int maxSubArray(int[] A) 
	 {
	       int newsum=A[0];
	       int max=A[0];
	       for(int i=1;i<A.length;i++)
	       {
	           newsum=Math.max(newsum+A[i],A[i]);
	           max= Math.max(max, newsum);
	       }
	       return max;
	 }
	 
	 public static void main(String args[])
	 {
		 int[] a = {-2,1,-3,-1,-1,2,3,-5,9};
		 System.out.println(maxSubArray(a));
		 
	 }
}
