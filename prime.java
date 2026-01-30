import java.util.Scanner;
class prime
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String ... args)
    {
        System.out.print("Enter a number: ");
        int userInput=sc.nextInt();
        boolean c=Prime(userInput);
        int a=check(c,userInput);
    }
    public static boolean Prime(int num)
    {
        boolean isPrime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
        // if(isPrime)
        // {
        //     System.out.print(num +"is a prime number");

        // }
    
    }
    public static int check(boolean isPrime,int num)
    {
      if(isPrime)
      {
        System.out.println(num+" is a prime number");
      }
      else{
        System.out.println(num+" is not a prime number");
      }

      return 0;
    }

}
