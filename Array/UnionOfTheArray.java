  package Array;

public class UnionOfTheArray {

	public static void main(String[] args) {
		int arr1[]= {1,3,4,8,9};
		int arr2[]= {3,5,6,7};
		int m=arr1.length;
		int n=arr2.length;
        union(arr1,m,n,arr2);
}

	public static void union(int arr1[],int m,int n,int arr2[]) {
		 int i = 0;
	        int j = 0;
	     while(i<m && j<n) {
	    	 if(arr1[i] < arr2[j]) {
	    		 System.out.print(arr1[i]+" ");
	    		 i++;
	    	 }
	    	 else if(arr2[j] < arr1[i]) {
	    		 System.out.print(arr2[j]+" ");
	    		 j++;
	    	 }
	    	 else {
	    		 System.out.print(arr2[j]+" ");
	    		 i++;
	    		 j++;
	    	 }
	     }
	     while(i < m) {
	    	 System.out.print(arr1[i]+" ");
	    	 i++;
	     }
	     while(j < n) {
	    	 System.out.println(arr2[j]+" ");
	    	 j++;
	     }
}
}
