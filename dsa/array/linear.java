package DSA;

public class linear {

	public static void main(String[]agre)
	{
		int abhi[]= {1,2,6,4,5,6,7,8,9};
		
		int search=6;
		
		boolean dada=false;
		
		for(int i=0;i<abhi.length;i++)
		{
			if(search==abhi[i])
			{
				System.out.println("Element found");
			    dada = true;
				break ;
			}	
		}
		if(!dada){
			System.out.println("Element is not found");
		}
	}
}
