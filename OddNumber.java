import java.util.Scanner;
class OddNumber 
{
	public static void checkOddOrNot(int n)
	{
		if(n%2!=0)
		{
			System.out.println(n+" is an odd number");
		}
		else
		{
			System.out.println(n+"is not an odd number");
		}
	}
	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is odd or not");
		num=sc.nextInt();
		checkOddOrNot(num);
	}
}

