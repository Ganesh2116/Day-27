//6. Write a function to find the largest and smallest digits in an n-digit number.

import java.util.Scanner;

class largSmallDigit
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int lar = 0;
	int sml = 9;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	if (rem >lar)
	{
	lar = rem;
	}else if (sml >rem)
	{
	sml = rem;
	}
	}
	System.out.println("largest number is :"+lar);
	System.out.println("Smallest number is :"+sml);
	}
}