package DSA;

public class find_sencond_max {
	
	public static void main(String[]agre)
	{
		int abhi[]= {1,2,6,4,5,3,4,2,2};
		
		int max=abhi[0];
		int second_max=abhi[0];
		
		for(int i=0;i<abhi.length;i++)
		{
			if(max<abhi[i])
			{
				second_max=max;
				max=abhi[i];
			}
			else if (second_max<abhi[i] && max>abhi[i])
			{
				second_max=abhi[i];
			}
		}
		System.out.print(second_max);
	}

}
