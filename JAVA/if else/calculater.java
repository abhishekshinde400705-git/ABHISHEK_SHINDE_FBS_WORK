package IF_ELSE;
import java.util.Scanner;
public class calculater {
	
	public static void main(String[]agre)
	{
		
		int num1,num2;
		char ch;
		Scanner no=new Scanner(System.in);
		Scanner abhi=new Scanner(System.in);
		
		System.out.print("Enter your first no:");
		num1=no.nextInt();
		
		System.out.print("Enter your second no:");
		num2=no.nextInt();
		
		System.out.print("Enter your operator(+,-,*,/):");
		ch=abhi.next().charAt(0);
		
		if(ch=='+') 
		{
			System.out.print("Additon of two no is:"+(num1+num2));
		}
		else if(ch=='-') 
		{
			System.out.print("Substraction of two no is:"+(num1-num2));
		}
		else if(ch=='*') 
		{
			System.out.print("Multiplication of two no is:"+(num1*num2));
		}
		else if(ch=='/') 
		{
			if(num2!=0)
			{
				System.out.print("division of two no is:"+(num1/num2));
			}
			else
			{
				System.out.print("division of two no is not possible:");
			}
			
		}
	}
	

}
