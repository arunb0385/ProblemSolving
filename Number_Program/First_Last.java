package Number_Program;

public class First_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power("3","10"));
		

	}
	public static int power(String a,String b) {
		int s=Integer.parseInt(a);
		int u=Integer.parseInt(b);
		int pow=1;  
		for(int i=1;i<=u;i++) {
		pow=pow*s;
		}
		
		
		int last=pow%10;
		return(pow);
		
	}

}
