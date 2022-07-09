import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int temp1 = n1;
		int temp2 = n2;
		
		while(n1 % n2 != 0)
		{
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		System.out.println("GCD of  " + temp1 + " and " + temp2 + " is " + n2);
		sc.close();
	}
}

/*
GCD OR HCF -> Greatest Common Divior or Highest Common Factor

n1 = 48 , n2 = 36
1.
n1 % n2 != 0
48 % 36 != 0 -> true
rem = n1 % n2 = 12
n1 = 36
n2 = 12

2. 36 % 12 != 0 ->false
so gcd is n2 = 12

*/