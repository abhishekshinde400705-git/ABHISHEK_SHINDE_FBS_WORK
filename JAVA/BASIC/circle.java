package basic;
import java.util.Scanner;
public class circle {
	public static void main(String[]agre) 
	{
		double pi=3.14,radius,area;
		Scanner circle=new Scanner(System.in);
		System.out.print("Enter your radius:");
		radius=circle.nextDouble();
		
		area=pi*radius*radius;
		System.out.print("area of circle is:"+area);
		
	}

}
