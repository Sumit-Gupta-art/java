import java.util.Scanner;
 public class perfectSquare
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String ... args)
    {
        System.out.print("Enter a number: ");
        int userInput=sc.nextInt();
        System.out.print(squareRoot(userInput));

    }
    public static boolean squareRoot(int num)
    {
        boolean flag=false;
        int i=0;
        for(i=1;i<=num/2;i++)
        {
            int product=i*i;
            if(product==num)
            {
                flag=true;
              break;
            }
            
            

        }
        return flag;
    }
}