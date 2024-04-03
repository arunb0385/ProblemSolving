package Array;

public class InversionCountOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {5,4,3,2,2};
         int N=arr.length;
         System.out.println("Number of count inverison : "+inversion(arr,N));
	}
	static int inversion(int a[],int n) {
		int count=0;
		for(int i=0;i<a.length;i++) {		
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
					count++;
			}
		}
		return count;
	}

}
