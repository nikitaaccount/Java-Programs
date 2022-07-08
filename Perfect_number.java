// Perfect Number is a number whose sum of factors (excluding the number itself)
//  is equal to that number
// example 6 => factors sum : 1+2+3 =6  6 == 6 so perfect number

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		
		int n,sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum = sum + i;
		}
		if(sum == n)
			System.out.println("Number "+ n + " is "+ " a perfect number");
		else
			System.out.println("Number "+ n + " is "+ " not a perfect number");
		
		sc.close();
		
	}

}
