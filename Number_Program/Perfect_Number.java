package Number_Program;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		System.out.println(show(n));

	}
	static boolean show(int x) {
		int sum=0;
		for(int i=1;i<x;i++) {
			if(x%i==0) {
				sum=sum+i;
			}
		}
		if(sum==x) 
			return true;
		
		return false;
	}
	

}
