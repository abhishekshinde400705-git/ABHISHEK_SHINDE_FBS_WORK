package DSA;

public class find_min {
	
	public static void main(String[]agre)
	{
		int abhi[] = {11,2,3,4,5,1,2,45,8,5,3,10};
			
		int min=abhi[0];
			
		for(int i=0;i<abhi.length;i++)	
			{
				if(min>abhi[i])
				{
					min=abhi[i];
				}
			}
        System.out.print(min);     
		
	}
	
}
