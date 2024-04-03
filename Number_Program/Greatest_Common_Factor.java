package Number_Program;
import java.util.*;
public class Greatest_Common_Factor {
                    
			 
		    // Recursive function to return gcd of a and b
 public int gcd(int a, int b)
		    {
		        // Everything divides 0
		    	 int c=b;
		        if (a == c)
		            return c;
		        else if (c == 0)
		            return a;
		 
		        // Base case
		        else if (a == c)
		            return a;
		 
		        // a is greater
		        if (a > b)
		            return gcd(a - b, b);
		        else
		        return gcd(a, b - a);
				 
		    }
		    
		    // Driver code
  public static void main(String[] args) {
		    	 Scanner ss=new Scanner(System.in);
		    	int a=ss.nextInt();
		    	int b=ss.nextInt();
		    	Greatest_Common_Factor ob=new Greatest_Common_Factor();
		    System.out.println(ob.gcd(a,b));   
		
		    }
		

	}


