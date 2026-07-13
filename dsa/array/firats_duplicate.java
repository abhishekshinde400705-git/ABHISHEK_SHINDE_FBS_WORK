package abhidada;

public class firats_duplicate {
	
	public static void main(String[]agre)
	{
		int abhi[]= {1,2,3,4,4,6,7,8,9,0};
		
		for(int i=0;i<abhi.length;i++)
		{
			for(int j=i+1;j<abhi.length;j++)
			{
				if(abhi[i]==abhi[j])
				{
					System.out.println("duplicate value is:"+abhi[i]);
					return ;
				}
				
			}
			
		}
		System.out.print("duplicate value is not found");
	}

}
