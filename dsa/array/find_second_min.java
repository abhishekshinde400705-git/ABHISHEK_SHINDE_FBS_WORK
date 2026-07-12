package DSA;

public class find_second_min {
	
	public static void main(String[]agre)
	{
		int abhi[]= {6,3,5,7,8,9,5,4,5,6,7,9};
		
		int min=abhi[0];
		int second_min=abhi[0];
		
		for(int i=0;i<abhi.length;i++)
		{
			if(min>abhi[i]) 
			{
				second_min=min;
				min=abhi[i];
			}
			else if(second_min>abhi[i]&&min<abhi[i])
			{
				second_min=abhi[i];
			}
		}
		System.out.print(second_min);
	}

}
