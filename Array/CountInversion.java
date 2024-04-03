package Array;

public class CountInversion {

	public static void main(String[] args) {
		int a[]={8, 4, 5, 1};
	    System.out.println(inversion(a));
 
	}
    public static int inversion(int a[]) {
    	int count=0;
    	for(int i=0;i<a.length;i++) {
    		for(int j=i+1;j<a.length;j++) {
    			if(a[i]>a[j])
    				count++;
    		}
    	}
    	return count;
    }
}
