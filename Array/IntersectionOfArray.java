package Array;

public class IntersectionOfArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8};
		int b[]= {4,8,7};
		int m=a.length;
		int n=b.length;
//		int x=0,y=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
