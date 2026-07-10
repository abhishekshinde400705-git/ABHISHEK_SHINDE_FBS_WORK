package DSA;

public class count_odd {

	public static void main(String[]agre)
	{
		int abhi[]= {1,2,3,4,5,6,7,8,9};
		
		int count=0;
		
		for(int i=0;i<abhi.length;i++)
		{
			if(abhi[i]%2!=0)
			{
				count++;
			}
		}
		System.out.print(count);
	}
}
