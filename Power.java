import java.util.Scanner;

public class Power {

	int power(int num,int pow)
	{
		if(pow == 0)
			return 1;
		else
			return (num * power(num ,pow-1));
	}
	public static void main(String[] args) {
		
		 Power o = new Power();
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int num = sc.nextInt();
         System.out.println("Enter the power");
         int pow = sc.nextInt();
         
         int res = o.power(num, pow);
         System.out.println(" Result of " + num + " ^ " + pow + " is " + res);
         sc.close();
	}

}
/* 
 *  power(5,3)
 *  5 * power(5,2)
 *  5 * 5 * power(5,1)
 *  5 * 5 * 5 * power(5,0)
 *  5 * 5 * 5 * 1
 *  125
 *   */
