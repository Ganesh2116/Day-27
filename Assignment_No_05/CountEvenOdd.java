// 3. Write a program to count the number of even and odd digits in an n-digit number.

import java.util.Scanner;

class CountEvenOdd
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int eCount = 0;
	int oCount = 0;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	 if (rem%2 == 0)
	{
	eCount++;
	}
	else 
	{
	oCount++;
	}
	}
	System.out.println("Even digits is in num :"+eCount);
	System.out.println("Odd digits is in num :"+oCount);
	}
}