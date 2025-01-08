/*
5. Write a program that takes an n-digit number and displays its digits in reverse order, separated by commas
*/

import java.util.Scanner;

class RevDigitSepCommas
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int srem = 0;
	int rev = 0;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	 rev = rev*10+rem;
	}
	System.out.println("The given number reverses :"+rev);
	for (int i = rev ;i>0;i=i/10)
	{
	 srem=i%10;
	System.out.println("'"+ srem +"'");
	}
	}
}