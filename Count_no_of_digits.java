import java.util.Scanner;

public class Count_no_of_digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int temp = n;
		int count = 0;
		
		while(n>0)
		{
			count++;
			n = n/10;
		}
		System.out.println("No of digits of " + temp + " is " + count);
		
		sc.close();

	}

}
