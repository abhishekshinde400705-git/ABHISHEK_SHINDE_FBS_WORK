package DSA;

public class find_max {
	

	public static void main(String[]agre)
	{
		int abhi[]= {9,2,3,4,555,7,7,8,99};
		
		int max=abhi[0];
		for(int i=0;i<abhi.length;i++)
		{
			if(max<abhi[i])	
			{
				max=abhi[i];
			}
		}
		
		System.out.print(max);
		
	}

}
