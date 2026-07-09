package DSA;

public class count_neg {
	
	public static void main(String[]agre)
	{
		int abhi[]= {1,2,-9,2,-6,-11,5,1,2,-66,-55};
		
		int count=0;
		
		for(int i=0;i<abhi.length;i++)
		{
			if(abhi[i]<0)
			{
				count++;
			}
		}
		
		System.out.print(count);
	}

}
