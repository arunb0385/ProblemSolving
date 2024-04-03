package Number_Program;

public class Factors_of_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(12);

	}
	static void show(int a) {
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
			
		}
		
	}

}
