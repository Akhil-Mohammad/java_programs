import java.util.Scanner;
class EvenNumber 
{
	public static void checkEvenOrNot(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is an even number");
		}
		else
		{
			System.out.println(n+"is not an even number");
		}
	}
	public static void main(String[] args)
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check wheather it is ever or not");
		num=sc.nextInt();
		checkEvenOrNot(num);
	}
}
