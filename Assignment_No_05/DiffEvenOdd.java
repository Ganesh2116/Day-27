/*
9. Develop a program to calculate the difference between the sum of the even-positioned and odd-positioned digits of an n-digit number.
*/

import java.util.Scanner;

class DiffEvenOdd
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int evensum = 0;
	int oddsum = 0;

	for (int i = num; i>0; i=i/10)
	{
	rem = i%10;
	if (rem%2 == 0)
	{
	evensum = evensum+rem;
	}
	else if (rem%2 != 0)
	{
	oddsum = oddsum+rem;
	}
	}
	int diff = evensum - oddsum;
	System.out.println("The sum of even number is :"+evensum );
	System.out.println("The sum of odd number is :"+oddsum );
	System.out.println("Difference between even and odd digit is :"+diff );
	}
}