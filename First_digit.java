import java.util.Scanner;

public class First_digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		while(n>=10)
		{
			n = n/10;
		}
		System.out.println("First digit is  " + n);
		
		sc.close();
	}
}

/*
 *  n = 567
 *  
 *  1.
 *  567 > = 10 -> true 
 *  n = 567 / 10 = 56
 *  
 *  2.
 *  56 > = 10 -> true
 *  n = 56 / 10 = 5
 *  
 *  3. 
 *  5 > = 10 -> false
 *  
 *  so n = 5 will be printed.
 *  
 *  
 *  
 * 
 */
