package IF_ELSE;
import java.util.Scanner;
public class div__by_5_and_11 {
	
	public static void main(String[]agre)
	{
		int num;
		Scanner no=new Scanner(System.in);
		
		System.out.print("Enter your no:");
		num=no.nextInt();
		
		if(num%5==0&&num%11==0)
		{
			System.out.print("no is divisiable by 5 and 11");
		}
		else
		{
			System.out.print("no is not divisiable by 5 and 11");
		}
	}

}
