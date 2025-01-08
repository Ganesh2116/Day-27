//7. Create a program to find the product of all non-zero digits in an n-digit number.

import java.util.Scanner;

class ProDigit
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	int rem = 0;
	int pro = 1;
	for (int i = num ;i>0;i=i/10)
	{
	 rem =i%10;
	 pro = pro*rem;
	}
	System.out.println("The product of digits is :"+pro);
	}
}