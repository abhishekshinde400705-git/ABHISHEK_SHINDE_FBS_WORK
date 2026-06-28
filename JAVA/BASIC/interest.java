package basic;
import java.util.Scanner;
public class interest {
	public static void main(String[]agre)
	{
		double amount,time,rate,interest;
		
		Scanner abhi=new Scanner(System.in);
		
		System.out.print("Enter your amount:");
		amount=abhi.nextDouble();
		
		System.out.print("Enter your time:");
		time=abhi.nextDouble();
		
		System.out.print("Enter your rate:");
		rate=abhi.nextDouble();
		
	   interest= (amount*time*rate)/100;
	   System.out.print("your interest is:"+interest);
	}
}
