import java.util.Scanner;

public class Palindrome {

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
		if(rev == temp)
		    System.out.println("Number is palindrome number ");
		else
			System.out.println("Number is not a palindrome number ");
		sc.close();
		
	}

}
