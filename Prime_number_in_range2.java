import java.util.Scanner;

public class Prime_number_in_range2 {

	public static void main(String[] args) {
		
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter two numbers within which you want prime numbers ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		System.out.println(" Prime Numbers between " + n1 + " and " + n2 + " are " );
		for(int i=n1;i<=n2;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}		
			}
			if(isPrime)
				System.out.print( i + " ");
		}
		sc.close();
	}
}
