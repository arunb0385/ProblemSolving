 package Array;
import java.util.*;
public class Duplicate_element {
	   Scanner ss=new Scanner(System.in);
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate_element ob=new Duplicate_element();
		ob.show();
	}
	void show() {
		int i;
		int arr[]=new int[6];
		for( i=0;i<arr.length;i++) {
			arr[i]=ss.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			int a=arr[i];
			boolean ap=true;
			for(int j=0;j<i;j++) {
			
				if(a==arr[j]) {
					ap=false;
					break;
				}
			}
			if(ap) {
				int fry=0;
				for(int j=0;j<arr.length;j++) {
					if(a==arr[j]) {
						fry++;
					}
				}
				System.out.println(a+" : "+fry);
			}
		}
	}

}


