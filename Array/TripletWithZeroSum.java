package Array;

public class TripletWithZeroSum {

	public static void main(String[] args) {
		
		int a[]= {1,2,-3,4,5};
		int len=a.length;
         zero(a,len);
	}
	
	public static void zero(int a[],int len) {
		int count=0;
		for(int i=0;i<len-2;i++) {
			for(int j=i+1;j<len-1;j++) {
				for(int z=j+1;z<len;z++) {
					if(a[i]+a[j]+a[z]==0) {
						System.out.println(a[i]+" "+a[j]+" "+a[z]+" = 0");
						count++;
					}
				}
			}
		}
		if(count==0)
			System.out.println("sum of triplet Not exist");
	}

}
