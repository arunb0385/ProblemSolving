package Array;

public class MaxProdectSubarray {

	public static void main(String[] args) {
		int arr[]= {2,2,1,0,2,3};
		System.out.println("Maximum product subarray : "+subarray(arr));

	}
   static int subarray(int a[]) {
	   int N=a.length;
	   int result=a[0];
	   for(int i=0;i<N;i++) {
		   int mul=a[i];
		   for(int j=i+1;j<N;j++) {
		//    	   result=Math.max(result, mul);
			   mul*=a[j];
		   }
		   result=Math.max(result, mul);
	   }
	   return result;
   }
}
