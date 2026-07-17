package abhidada;

public class left_rotation {

	public static void main(String[]agre)
	{
		int abhi[]= {1,2,3,4,5,6,7,8,9};
		int first=abhi[0];
		 for(int i=0;i<8;i++)
		 {
			 abhi[0]=abhi[i+1];
		 }
		 abhi[8]=first;
		 
		 for(int j=0;j<abhi.length;j++)
		 {
			 System.out.print(abhi[j]+" ");
		 }
	}
}
