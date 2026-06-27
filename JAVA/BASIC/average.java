package basic;
import java.util.Scanner;
public class average {
	public static void main(String[]agre)
	{
		int c,cpp,java,sql,java_Script;
		double total_Mark,total_Average;
		Scanner average=new Scanner(System.in);
		
		System.out.print("Enter your c mark:");
		c=average.nextInt();
		
		System.out.print("Enter your cpp mark:");
		cpp=average.nextInt();
		
		System.out.print("Enter your java mark:");
		java=average.nextInt();
		
		System.out.print("Enter your sql mark:");
		sql=average.nextInt();
		
		System.out.print("Enter your java script mark:");
		java_Script=average.nextInt();
		
		total_Mark=c+cpp+java+sql+java_Script;
		
		total_Average=total_Mark/5;
		
		System.out.println("total mark is:"+total_Mark);
		System.out.println("total average mark is:"+total_Average);
		
	}
	

}
