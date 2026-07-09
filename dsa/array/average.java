package DSA;

public class average {
	
	public static void main(String[]agre)
	{

		int abhi[]= {1,2,3,4,5,6,7,8,9,10};
		
		double sum=0,average;
		
		for(int i=0;i<abhi.length;i++)
		{
			sum=sum+abhi[i];
		}
		average=sum/10;
		System.out.print(average);
	}

}
