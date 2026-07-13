package abhidada;

public class first_even {
	
	public static void main(String[]agre)
	{
		int abhi[]= {11,1,1,1,1,1,1,1,1,1,1};
		
		for(int i=0;i<abhi.length;i++)
		{
			if(abhi[i]%2==0)
			{
				System.out.print("First even element is:"+ abhi[i]);
				return;
			}
		}
		System.out.print("not even element present in this array");
	}

}
