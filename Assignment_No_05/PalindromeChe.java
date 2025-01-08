// 8. Write a program that takes an n-digit number and checks if it is a palindrome.

import java.util.Scanner;

class PalindromeChe
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int rev = 0;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	 rev =rev*10+rem;
	}
	if (num == rev)
	{
	System.out.println("This is palindrome num .");
	}
	else 
	{
	System.out.println("This is not palindrome num .");
	}
	}
}