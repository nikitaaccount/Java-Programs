import java.util.Scanner;

public class Sum_of_digits_recursion {
	
	int sum(int num)
	{
		if(num == 0)
			 return 0;
		else
			return ((num % 10) + sum(num/10));
	}

	public static void main(String[] args) {
		
            Sum_of_digits_recursion o1 = new Sum_of_digits_recursion();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int res = o1.sum(n);
            System.out.println("Result is " + res);
            sc.close();
            
	}

}


/*
 *  ((123 % 10) + sum(123/10))
     3 + sum(12)
     3 + (2 + sum(1))
     3 +  (2 + ((1 + sum(0)))
     3 + 2 + 1 = 6
     
 */
