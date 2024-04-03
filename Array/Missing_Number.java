 package Array;

public class Missing_Number {
	  public static void main(String[] args)
	    {
	        int[] arr = { 1, 2, 3, 5 };
	        int sum1=0,sum2=0,i;
            for( i=0;i<arr.length;i++) {
            	sum1=sum1+arr[i];
            }
            for(i=1;i<=5;i++) {
            	sum2=sum2+i;
            }
            int sum=sum2-sum1;
            System.out.println("Missing Number : "+sum);
   }
}