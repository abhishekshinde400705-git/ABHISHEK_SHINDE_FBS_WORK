package IF_ELSE;
import java.util.Scanner;
public class grade {
	public static void main(String[]agre)
	{
		int mark;
		Scanner abhi=new Scanner(System.in);
		
		System.out.print("Enter your mark:");
		mark=abhi.nextInt();
		
		if(mark>80)
		{
			System.out.print("Grade=A");
		}
		else if(mark>70)
		{
			System.out.print("Grade=B");
		}
		else if(mark>60)
		{
			System.out.print("Grade=C");
		}
		else if(mark>50)
		{
			System.out.print("Grade=D");
		}
		else if(mark>40)
		{
			System.out.print("Grade=F");
		}
		else if(mark>35)
		{
			System.out.print("Grade=PASS");
		}
		else
		{
			System.out.print("Grade=FAIL");
		}
		
	}

}
