import java.util.Scanner;

public class Factors_of_num {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			int i;
			for(i=1;i*i<n;i++)
			{
				if(n%i==0)
					System.out.println(i);
			}
			for(;i>=1;i--)
			{
				if(n%i==0)
					System.out.println(n/i);
			}	
			sc.close();
		}
	}

}
