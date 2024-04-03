package Array;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int a=ss.nextInt();
		primenum(a);

	}
  static void primenum(int n) {
	  
	  for(int i=1;i<=n;i++) {
		  int count=0;
		  for(int j=1;j<=n;j++) {
			  if(i%j==0)
				  count++;
		  }
		  if(count==2)
			  System.out.print(i+" ");
	  }
	
  }
}
