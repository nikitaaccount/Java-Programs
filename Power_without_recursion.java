import java.util.Scanner;

public class Power_without_recursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Enter the power ");
		int power = sc.nextInt();
		
		int prod = 1;
		int temp = power;
		
		while(power>0)
		{
			prod = prod * num;
			power--;
		}
		
		System.out.println("Result of " + num + " ^ " + temp + " is " + prod);
		sc.close();
	
	}
}
