import java.util.Scanner;

public class Fibbonacci_using_recursion {

	static int fib(int num)
	{
		if(num == 0)
			return 0;
		if(num == 1)
			return 1;
		
		else return 
				fib(num-1)+fib(num-2);
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		System.out.println("Fibbonacci Series is ");
		
		for(int i=0;i<n;i++)
			System.out.println(fib(i)+ " ");
		
		sc.close();	
	}
}