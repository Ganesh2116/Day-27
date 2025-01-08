// 4. Develop a function that reverses the digits of an n-digit number
	
import java.util.Scanner;

class RevDigit
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
	 rev = rev*10+rem;
	System.out.println(rem);
	}
	System.out.println("The given number reverses :"+rev);
	}
}