// import java.util.Scanner;
// class playground
// {
//     public static void main(String ... args)
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number to check even or odd: ");
//         int n=sc.nextInt();
//         String[] s={"Even","odd"};
//         System.out.println(s[n%2]);
//         // String s=n%2==0?"Even":"odd";
//         // System.out.print(s);
//     }
// }
class playground
{
    public static void main(String ... args)
    {
        int a=2;
        int b=3;
        int c=5;
        a=b;
        b=c;
        c=b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}