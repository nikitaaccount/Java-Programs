import java.util.Scanner;

public class Prime_number {
	
	public static boolean isPrime(int num)
	{
		if(num==1)                // 2 is the first prime number
			return false;
		if(num==2  || num==3)
			return true;
	
		for(int i=2;i*i<=num;i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		if(isPrime(n))
		        System.out.println("The number " + n + " is a prime number " );
		else
			    System.out.println("The number " + n + " is not a prime number " );
		sc.close();	
	}

}

