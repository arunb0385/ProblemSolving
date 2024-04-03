package Number_Program;
import java.math.*;
public class Power_of_the_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(show(3, 10));

	}
	 static int show(int x,int y) {
		int power=1;
		for(int i=1;i<=y;i++) {
			power=power*3;
		}
		return power;
	}

}
