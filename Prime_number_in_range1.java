import java.util.Scanner;

public class Prime_number_in_range1 {
	
	public static boolean isPrime(int num)
	{
		if(num==1)
			return false;
		
		if(num==2 || num ==3)
			return true;
		
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void getPrimeNumbers(int n1,int n2)
	{
		System.out.println(" Prime Numbers between " + n1 + " and " + n2 + " are " );
		for(int i=n1;i<=n2;i++)
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter two numbers within which you want prime numbers ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		getPrimeNumbers(n1,n2);
		sc.close();
	}

}

