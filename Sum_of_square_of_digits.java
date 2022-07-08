import java.util.Scanner;

public class Sum_of_square_of_digits {

		int sum(int num)
		{
			if(num == 0)
				 return 0;
			else
				return(((num % 10) * (num%10))+ sum(num/10));
		}

		public static void main(String[] args) {
			
			    Sum_of_square_of_digits o1 = new Sum_of_square_of_digits();
	            Scanner sc = new Scanner(System.in);
	            
	            System.out.println("Enter the number");
	            int n = sc.nextInt();
	            int res = o1.sum(n);
	            System.out.println("Result is " + res);
	            sc.close();	            
		}
	}


	/*
	 *   1^2 + 2^2 + 3^2
	 *  ((123 % 10)* (123 % 10)) + sum(123/10)
	     3*3 + sum(12)
	     9 + ((12%10 * 12%10) + sum(12/10))
	     9 + (2*2) + sum(1)
	     9 + 4 + ((1%10 * 1%10) + sum(0))
	     9 + (4 + ((1+0))
	     9 + (4+1)
	     9+5 =14
	     
	 */
