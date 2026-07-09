package DSA;

public class binaray {

	public static void main(String[]agre)
		{
		
		int abhi[]= {1,2,3,4,5,6,0,8,9,19};
		int low=0,high=abhi.length-1;
		int mid;
		boolean dada=false;
		int search=7;
		while(high>=low)
		{
			mid=(low+high)/2;
			if( abhi[mid]==search)
			{
				System.out.print("Element found");
				
				dada = true;
				break;
			}
			else if(abhi[mid]>search)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		if(!dada)
		{
			System.out.print("Element not found");
		}
		
		}
}
