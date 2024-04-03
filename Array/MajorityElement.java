package Array;

public class MajorityElement {

	public static void main(String[] args) {
		 int arr[]= {1,5,4,5,2,5,5,5};
		 int N=arr.length;
		 majElement(arr,N);
	}
  static void majElement(int arr[],int N) {
	  int maxcount=0;
	  int index=0;
	  for(int i=0;i<N;i++) {
		  int count=0;
		  for(int j=0;j<N;j++) {
			  if(arr[i]==arr[j]) {
				  count++;
			  }
		  }
		  if(count>maxcount) {
			  maxcount=count;
			  index =i;
		  }
	  }
	  if(maxcount>N/2)
		  System.out.println( "Majority element is : "+arr[index]);
	  else
		  System.out.println("No Majority Element");
  }
}
