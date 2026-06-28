package basic;
import java.util.Scanner;
public class convaer_Day {
	public static void main(String[]agre)
	{
		int total_Day,year,month,day;
		Scanner days=new Scanner(System.in);
		System.out.print("Enter your total days:");
		total_Day=days.nextInt();
		
		year=total_Day/365;
		total_Day=total_Day%365;
		month=total_Day/30;
		day=total_Day%30;
		
		System.out.println("total year:"+year);
		System.out.println("total month:"+month);
		System.out.println("total day:"+day);
	}

}
