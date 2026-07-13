package com.dsa;

public class first_unique_element {
	
	public static void main(String[]agrs)
	{
		int abhi[]= {1,2,3,4,5,4,3,2,1,6,7,8};
		
		for(int i=0;i<abhi.length;i++)
		{
			int count=0;
			for(int j=0;j<abhi.length;j++)
			{
				if(abhi[i]==abhi[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print("first_unique_element:"+abhi[i]);
				return;
			}
		}
	}

}
