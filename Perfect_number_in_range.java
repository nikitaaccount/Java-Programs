import java.util.Scanner;

public class Perfect_number_in_range {

	void perfect(int num1,int num2)
	{
		for(int i=num1;i<=num2;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					sum = sum + j;
			}
			if(sum == i)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Perfect_number_in_range o1 = new Perfect_number_in_range();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start and end range");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Result is ");
		o1.perfect(n1,n2);
		sc.close();
          
	}

}
