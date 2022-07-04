import java.util.Scanner;

public class Fibbonacci {
	
	static void fib(int num)
	{
		if(num == 0)
			System.out.println(0);
		if(num == 1)
			System.out.println(1);
		
		int n1=0,n2=1,n3;
		System.out.print(n1 + " " + n2 + " " );
		
		for(int i=2;i<=num;i++)
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(n3 + " ");
		}
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		fib(n);
		sc.close();		
	}
}
