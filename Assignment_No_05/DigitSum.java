/* 2. Create a function that takes an n-digit number as input and returns the sum of its digits.*/

import java.util.Scanner;

class DigitSum
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int sum = 0;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	 sum = sum+rem;
	}
	System.out.println("Sum of all digits is :"+sum);
	}
}