package IF_ELSE;
import java.util.Scanner;
public class EVEN_OR_ODD {
	public static void main(String[]agre)
	{
		int num;
		Scanner no=new Scanner(System.in);
		System.out.print("Enter your no to check:");
		num=no.nextInt();
		
		if(num%2==0)
		{
			System.out.print("no is even");
		}
		else
		{
			System.out.print("no is odd");
		}
	}

}
