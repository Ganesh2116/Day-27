/*10. Write a function that takes an n-digit number and returns the count of digits greater than a specified value.*/

import java.util.Scanner;

class SpecifiedVal
{
	public static void main(String[] arge)	
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	
	System.out.println("Enter the Specified number:");
	int spe = sc.nextInt();
	
	int rem =0;
	int count =0;
	
	for (int i= num; i>0 ;i=i/10)
	{
	rem = i%10;
	if (rem>spe)
	{
	count++;
	}
	}
	System.out.println("The specified values greater than digits count is  :"+count);
	}
	
}