import java.util.Scanner;

public class Gcd_recursion {
	
	int gcd(int n1,int n2)
	{
		if(n2 == 0)
			 return n1;
		else
		{
			return gcd(n2,(n1 % n2));
		}
	}
	public static void main(String[] args) {
		
        Gcd_recursion o1 = new Gcd_recursion();
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter two numbers ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int res = o1.gcd(n1,n2);
		System.out.println(" GCD is " + res);
		sc.close();

	}
}


/*
 * gcd(48,36)
 * 
 * 1. gcd(36,(48%36))
 *    gcd(36, 12)
 *    
 * 2. gcd(12, (36%12))
 *    gcd(12, 0)
 *    
 *    n2 = 0 -> true
 *    so  return n1 = 12 is gcd
 */
