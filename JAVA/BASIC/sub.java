package basic;
import java.util.Scanner;
public class sub {
	
	public static void main (String[] args)
	{
		Scanner abhi = new Scanner(System.in);
		
		int num1,num2,sub;
		
		System.out.println("Enter your first no:");
		num1=abhi.nextInt();
		
		System.out.println("Enter your second no:");
		num2=abhi.nextInt();
		
		System.out.println("substraction of two no:" + (num1-num2));
		
	}

}
