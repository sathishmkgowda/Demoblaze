package java_programming;

public class largestPossible_Palindrome_inan_givenString {
	public static void main(String[] args) 
	{
	String str="ghfjqacaqbnq";
	
	int start=0,end=0,max=0;
	
	for (int i = 0; i < str.length(); i++)    //start index 
	{
		for (int j = 0; j < str.length(); j++)  //end index 
		{
			int flag=1;
			for(int k=0; k<(j-i+1)/2; k++)  //check for palindrome
			{
				if(str.charAt(i+k)!=str.charAt(j-k))
                    {
	                    flag=0;
                    }
			}
			if(flag==1 && (j-i+1)>max)
			{
				start=i;
				max=j-i+1;
				end=start+max;
			}
		}
	}
	for(int i=start; i<end; i++)
	{
		System.out.print(str.charAt(i));
	}
	
	
	
	}

}
