import java.util.Scanner;

// Perfect Number is a number whose factors sum is equal to that number except that number.
// example 6 => 1+2+3 =6 

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
