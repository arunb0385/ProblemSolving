package Array;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oc=new Scanner(System.in);
		int temp=0;
		int ac[]=new int[6];
		for(int i=0;i<ac.length;i++){
			ac[i]=oc.nextInt();
		}
		for(int i=0;i<ac.length;i++){
			for(int j=i+1;j<ac.length;j++){
				if(ac[i]>ac[j]){
					temp=ac[i];
					ac[i]=ac[j];
					ac[j]=temp;
				}
			}
			}
			
		for(int i=0;i<ac.length;i++){
			
			System.out.print((ac[i])+" ");
		}
		System.out.println("Maximum value : "+ac[ac.length-1]);
        System.out.println("Minimum value : "+ac[0]);
        System.out.println("Third largest value : "+ac[ac.length-3]);
}
}

//for third largest value we use  if(length<3)
