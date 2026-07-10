package abhidada;

public class delete {
	
	public static void main (String[]agre)
	{
		int abhi[]={1,2,3,4,5,6,7,8,9,0};
		
		int index=5,n=9;
		
		for(int i=index;i<n;i++)
		{
			abhi[i]=abhi[i+1];
		}
		
		n--;
		for(int i=0;i<n;i++)
		{
			System.out.print(abhi[i]+ " ");
		}
		
	}

}
