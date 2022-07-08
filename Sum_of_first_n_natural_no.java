import java.util.Scanner;

public class Sum_of_first_n_natural_no {
	int sum(int num)
	{
		if(num == 1)
			 return num;
		else
			return(num + sum(num - 1));
	}

	public static void main(String[] args) {
		
		    Sum_of_first_n_natural_no o1 = new Sum_of_first_n_natural_no();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int res = o1.sum(n);
            System.out.println("Result is " + res);
            sc.close();	            
	}
}
/*
 * sum(4)
 * 4 + sum(3)
 * 4 + 3 + sum(2)
 * 4 + 3 + 2 + sum(1)
 * 4 + 3 + 2 + 1 
 * =  10
 * 
 * 
 */
