package abhidada;

public class insert {
	
	public static void main(String[]agre)
	{
		int abhi[]= {1,2,3,4,5,6,0};
		int index=3,value=1111;
		
		for(int i=6;i>index;i--)
		{
			abhi[i]=abhi[i-1];
		}
		abhi[index]=value;
		
		for(int i=0;i<abhi.length;i++)
		{
			System.out.print(abhi[i]+ " ");
		}
		
	}

}
