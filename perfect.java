import java.util.Scanner;
class perfect
{
    public static void main(String ... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int userInput=sc.nextInt();
        int  sum=1;
        boolean isPositive;
        if(userInput<1)
        {
            isPositive=false;
    
        }
        else
        {
            for(int i=2;i<userInput;i++)
            {
                if(userInput%i==0)
                {
                    sum+=i;
                }
            }
            if(userInput==sum)
            {
                System.out.println(userInput+" Is a perfect number");
            }
            else
            {
                System.out.print("Not a perfect number :" +userInput);
            }
        }

    }
//     import java.util.Scanner;
// class playground
// {
//     static Scanner sc=new Scanner(System.in);
//     public static void main(String ... args)
//     {
//      System.out.print("Enter a number:");
//      int userInput=sc.nextInt();
//       perfectNumber(userInput);
//      compare(userInput,perfectNumber(userInput));
     
//     //  System.out.println(userInput);
//     }
//     public static int perfectNumber(int num)
//     {
//         int sum=0;
//         if(num>0)
//         {
//             for(int i=1;i<num;i++)
//             {
//                 if(num%i==0)
//                 {
//                     sum+=i;
//                 }
                
//             }
//         }
//         return sum;

//     }
//     public static void compare(int num,int sum)
//     {
//         if(num==sum)
//         {
//             System.out.println("Number is a perfect number: "+num);
//         }
//         else{
//             System.out.println("Number is a not pefect number :"+num);
//         }
//     }
// }
// }