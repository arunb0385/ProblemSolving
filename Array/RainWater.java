package Array;

public class RainWater {

	public static void main(String[] args) {
		int arr[]= {2,0,2,0,5,1,5};
		int N=arr.length;
		System.out.println(rainwater(arr,N));

	}
	
	static int rainwater(int arr[],int N) {
		int left=0,right=N-1;
		int max_L=0,max_R=0,result=0;
		while(left<=right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>=max_L) {
					max_L=arr[left];
				}
				else {
					result+=max_L-arr[left];
				}
				left++;
			}
			else {
				if(arr[right]>=max_R) {
					max_R=arr[right];
				}
				else {
					result+=max_R-arr[right];
				}
			}
		}
		return result;
	}

}
