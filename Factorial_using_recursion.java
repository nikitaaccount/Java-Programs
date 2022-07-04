import java.util.Scanner;

public class Factorial_using_recursion {

	static int fact(int num)
	{
		 if(num<=1)
			   return 1;
		 else
			  return num * fact(num-1);
	}
	public static void main(String[] args) {
		int n,res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n = sc.nextInt();
		res= fact(n);
		System.out.println("Factorial of " + n + " is " + res);
		sc.close();
	}
}
