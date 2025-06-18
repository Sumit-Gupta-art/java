 import java.util.Scanner;
class rnumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String ... args)
    {
        int ogNumber =sc.nextInt();
        System.out.print(reverse(ogNumber));

    }
    public static int reverse(int number)
    {
        int revers=0;
        while(number>0)
        {
            int i=number%10;
             revers=revers*10+i;
            number/=10;

        }
        return revers;
    }
}
