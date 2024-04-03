package Array;

import java.util.Arrays;

public class Rotatiion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		right();
      
	}
	static void right() {
		int a[]= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length-1;i++) {
			int firstno=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=firstno;
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
