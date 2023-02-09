package java_programming;

import java.util.ArrayList;

public class maximum_Number_inanArray {

	public static void main(String[] args)
	{
int [] arr= {1,2,3,4,27,9,11,5,13,17,14,19,22};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int k=0;
		
		//first finding maximum number in an array
		
		int limit=0;
		for(int i=0; i<arr.length; i++)
		{
			int a=0;          //1
			
			for(int j=0; j<arr.length; j++ )
			{
				if (arr[i]<arr[j])
				{
					a=a+1;
					break;
				}
			}
			
			if(a==0)
			{
				limit=arr[i];
			}
		}
		
		System.out.println(limit);       
		

	}

}
