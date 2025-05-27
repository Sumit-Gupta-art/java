import java.util.Scanner;
class strong
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		int userInput=sc.nextInt();
		int number=userInput;
		System.out.print(check(strongNumber(userInput),userInput));
	}
	public static int strongNumber(int num)
	{
		int sum=0;
		int temp=num;
		while(temp>0)
		{
			int fact=factorial(fetchLastDigit(temp));
			sum+=fact;
			temp=eliminateLastDigit(temp);
			
		}
		return sum;
	}
	public static int check(int fetch,int num)
	{
		if(num==fetch)
		{
			return num;
		}
		return 0;
		
	}
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static int fetchLastDigit(int num)
	{
		return num%10;
	}
	public static int eliminateLastDigit(int num)
	{
		return num/10;
	}
	
}