// 1. Write a program to input an n-digit number and print each digit on a new line.

import java.util.Scanner;

class DigitNewLine
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	System.out.println(rem);
	}
	}
}