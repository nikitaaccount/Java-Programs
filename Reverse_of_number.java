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
