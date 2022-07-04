import java.util.Scanner;

public class Remainder_divisor {

	public static void main(String[] args) {
		
		int n1,n2,rem,divisor,quotient;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		rem = n1 % n2;
		System.out.println("Remainder is " + rem);
		
		divisor = n2;
		System.out.println("Divisor is " + divisor);
		
		quotient = n1 / n2;
		System.out.println("Quotient is " + quotient);
		
		sc.close();
	}

}
