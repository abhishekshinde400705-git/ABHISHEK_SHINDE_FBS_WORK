package DSA;

public class cout_zero {
	
	
	public static void main(String[]agre)
	{
		int abhi[]= {1,2,-9,2,0,-11,5,1,0,-66,0};
		
		int count=0;
		
		for(int i=0;i<abhi.length;i++)
		{
			if(abhi[i]==0)
			{
				count++;
			}
		}
		
		System.out.print(count);
	}

}
