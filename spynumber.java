import java.util.Scanner;
class spynumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        input();
    }
    public static void input()
    {
        System.out.print("Enter a number: ");
        int userInput=sc.nextInt();
        
        System.out.print(compare(sum(userInput),product(userInput),userInput));
    }
    public static int sum(int number)
    {
        int temp=number;
        int sum=0;
        while(temp>0)
        {
            int p=fetchLastDigit(temp);
            sum+=p;
            temp=eliminateLastDigit(temp);

        }
        return sum;
    }
    public static int product(int number)
    {
        int temp=number;
        int sum=1;
        while(temp>0)
        {
            int p=fetchLastDigit(temp);
            sum*=p;
            temp=eliminateLastDigit(temp);
        }
        return sum;
    }
    public static int eliminateLastDigit(int number)
    {
        return number/10;
    }
    public static int fetchLastDigit(int number)
    {
        return number%10;
    }
    public static int compare(int sum,int product,int num)
    {
        if(sum==product)
        {
            System.out.print(num+" is a spy number");
        }
        else
        {
            System.out.print(num+" is not a spy number");
        }
        return 0;
    }
}