package Array;

public class LongestSubarray {
 public static void main(String[] args) {
    int arr[]= {4,5,6,7,9,10,11,12,13,14,15};
    int N=arr.length;
    System.out.println(subarray(arr,N));
 }
 
 static int subarray(int arr[],int N) {
	 int maxi=0;
	 for(int i=0;i<N-1;i++) {
		 int count=1;
		 for(int j=i;j<N-1;j++) {
			 if(arr[j]+1==arr[j+1]) 
				 count++;
			 
			 else
				 break;				 
		 }
		 maxi=Math.max(maxi, count);
	 }
	 return maxi;
 }
 
 }
