package Array;

public class FindPairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {2, -1, 2, -3, 1};
         int x=2;
         int len=a.length;
//         if(show(a,x,len))
//        	 System.out.println("Yes");
//         else
//        	 System.out.println("No");
         
         //3sum
         int b[]= {1,2,3,4};
         int y=6;
         int z=30;
         int lenb=b.length;
//         if(sum3(b,lenb,y))
//        		 System.out.println("yes");
//         else
//        	 System.out.println("No");
         //sum 4
         if(sum4(b,lenb,z))
    		 System.out.println("yes");
     else
    	 System.out.println("No");
	}
	public static boolean show(int a[],int x,int len) {
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==x)
					return true;
			}
		}
		return false;
	}
	
	//sum3
	public static boolean sum3(int b[],int lenb,int y) {
		for(int i=0;i<lenb-2;i++) {
			for(int j=i+1;j<lenb-1;j++) {
				for(int k=i+2;k<lenb;k++) {
					if(b[i]+b[j]+b[k]==y)
						return true;
				}
			}
		}
		return false;
	}
	
	
//sum4
	public static boolean sum4(int b[],int lenb,int z) {
		for(int i=0;i<lenb-3;i++) {
			for(int j=i+1;j<lenb-2;j++) {
				for(int k=i+2;k<lenb-1;k++) {
					for(int l=i+3;l<lenb;l++) {
						if(b[i]+b[j]+b[k]+b[l]==z)
							return true;
					}
				}
			}
		}
		return false;
	}
	
}
