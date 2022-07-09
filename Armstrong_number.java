// For 3 digit number
// Number whose sum of cubes of digits is equal to that number 
// 153 is Armstrong number since 1^3 +5^3 + 3^3=153

import java.util.Scanner;

public class Armstrong_number {

	int pow(int n,int r)
	{
		int i,p=1;
		for(i=1;i<=r;i++)
		{
			p=p*n;
		}
		return p;
	}
	public static void main(String[] args) {
		
		Armstrong_number o1 = new Armstrong_number();
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int temp,rem,sum=0,digit=0;
		
		// Count the no of digits
		temp=n;
		while(temp!=0)
		{
			digit++;
			temp=temp/10;
		}
		
		//checking for ARMSTRONG
		temp=n;
		while(temp!=0)
		{
		 int res;
		 rem=temp % 10;
		 res = o1.pow(rem,digit);
		 sum=sum + res;
		 temp=temp/10;	
		}

	    if(n==sum)
		   System.out.println(n + " is Armstrong number ");
		else
		   System.out.println(n + " is not an Armstrong number ");
	    sc.close();

	}
}
