import java.util.Scanner;

public class Reverse_using_recursion {
	
	int rev = 0;
    int reverse(int num)
    {
        if(num == 0)
        	return rev;
        else
        {
        	rev = ((rev * 10)+ (num % 10 ));
        	return reverse(num / 10);
        }
    }

	public static void main(String[] args) {
		
		Reverse_using_recursion o1 = new Reverse_using_recursion();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int res = o1.reverse(n);
		System.out.println("Result is " + res);
		sc.close();
	}
}


/*
     1. reverse(123)
        rev = (rev * 10) + (123 % 10)
             = (0 * 10) + 3 = 3
             
     2. reverse(12)
        rev  = ((3 * 10) + (12 % 10))
               30 + 2 = 32
               
     3. reverse(1)
        rev  = ( 32 * 10 ) + (1 % 10)
             =   320 + 1 = 321
             
     4. reverse(0)
        return rev = 321
      
     
     
*/