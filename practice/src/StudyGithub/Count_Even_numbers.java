package StudyGithub;

public class Count_Even_numbers 
{
	public static void main(String[] args) 
	{
	int num = 100;
	int count = 0;
	int count1=0;
	for(int i=1; i<=num; i++)
	{
	if(i%2==0)
	{
	//System.out.println("Given number is Even");
	count=count+1;
	}
	else
	{
	//System.out.println("Given number is odd");
	count1=count1+1;
	}
	}
	System.out.println("Number of Even Number: "+count);
	System.out.println("Number of Odd Number: "+count1);
	}


}
