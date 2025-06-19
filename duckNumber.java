import java.util.Scanner;
class duckNumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String ... args)
    {
        System.out.print("Enter a number: ");
        String num=sc.nextLine();
        char charAt0=num.charAt(0);
        boolean isDuck=true;
        if(charAt0=='0')
        {
            isDuck=false;
            
        }
        else{
            for(int i=1;i<num.length();i++)
            {
                if(num.charAt(i)=='0')
                {
                    isDuck=true;
                    break;
                }
            }
           
        }
         if(isDuck)
            {
                System.out.println(num +"Is   a duck number");
            }
            else{
                System.out.println(num +"Is not a duck number");
            }
    }
}
