// prime nested

class prime
{
	public static void main(String[] arge)
	{
	for (int j = 1 ; j <=100;j++)
	{
	int count =0;
	for (int i =1 ;i<=j;i++)
	{
	int n= j%i;
	if ( n == 0)
	{
	count++;
	}
	}
	if(count == 2)
	{
	System.out.println(j);
	}
	}
	}
}