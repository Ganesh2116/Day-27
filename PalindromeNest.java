// palindrome


class PalindromeNest
{
	public static void main(String[] arge)	
	{
	int rem;
	int rev;
	for (int i =1;i<=100;i++)
	{
	rev =0;
	for (int j=i; j>0; j=j/10)
	{
	rem = j%10;
	rev = rev*10+rem;
	}
	if (i == rev)
	{
	System.out.println(i);
	}
	}
	}
}