package basic;
import java.util.Scanner;
public class div {
	
	public static void main(String[]agre)
	{
		int num1,num2,div;
		Scanner abhi=new Scanner(System.in);
		
		System.out.print("Enter your first no:");
		num1=abhi.nextInt();
		
		System.out.print("Enter your second no:");
		num2=abhi.nextInt();
		
		div=num1/num2;
		System.out.println("division of two no is:"+ div);
	}
	

}
