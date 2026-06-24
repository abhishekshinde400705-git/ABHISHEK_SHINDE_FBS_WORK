package basic;
import java.util.Scanner;
public class add {
	
	public static void main (String[] args)
	{
		Scanner abhi = new Scanner(System.in);
		int num1,num2,sum;
		
		System.out.println("Enter your first no:");
		
		num1=abhi.nextInt();
		
        System.out.println("Enter your first no:");
		
		num2=abhi.nextInt();
		
		sum=num1+num2;
		
		System.out.println("additon of two no is:" + (num1+num2));
		
	}

}
