import java.util.Scanner;

public class Reverse_of_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int digit,rev = 0;
		int temp = n;
		while(n>0)
		{
			digit = n % 10;
			rev = (rev * 10) + digit;
			n = n/10;
		}
		System.out.println("Reverse of " + temp + " is " + rev );
		sc.close();

	}

}

/*
 * 123
 * digit = 123 % 10 = 3
 * rev = (0 * 10) + 3 = 3
 * n = 123 /10 = 12
 * 
 * digit = 12 % 10 = 2
 * rev = 3 * 10 + 2 = 32
 * n = 12 / 10 = 1
 * 
 * digit = 1 % 10 = 1
 * rev = 32*10 + 1 =321
 * n =1/ 10 = 0
 * false
 */
