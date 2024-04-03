package Array;

import java.util.Arrays;

public class Equal_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,1,5,4};
		int b[]= {1,2,4,3,5};
		Arrays.sort(b);
		Arrays.sort(a);
		//System.out.println(Arrays.toString(b));
		
		System.out.println(Arrays.equals(a, b));
	}

	

}
