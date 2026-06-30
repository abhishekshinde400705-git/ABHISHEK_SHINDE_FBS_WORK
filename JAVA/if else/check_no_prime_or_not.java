package IF_ELSE;
import java.util.Scanner;
public class check_no_prime_or_not {
	
	public static void main(String[]agre)
	{
		int num;
		Scanner no=new Scanner(System.in);
		
		System.out.print("Enter your no to check prime or not:");
		num=no.nextInt();
		
		if(num<2)
		{
			System.out.print("no is not prime:");
			return ;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					System.out.print("no is not prime:");
					return ;
				}
			}
			
			System.out.print("no is prime:");
			
		}
	}

}
