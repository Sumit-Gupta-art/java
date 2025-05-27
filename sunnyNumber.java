import java.util.Scanner;

class sunnynumber
{
    static Scanner sc=new Scanner(System.in);
    static perfectSquare s=new perfectSquare();
    public static void main(String[] args)
    {
    
      input();  
    }
    public static void input()
    {
        System.out.print("Enter a number: ");
      int userInput=sc.nextInt();
      calculateSum(userInput);
      
      
    }
    public static void calculateSum(int num)
    {
        int temp=num;
        temp+=1;
        
       boolean flag= s.squareRoot(temp);
       print(flag,num);
      
    }
    public static boolean print(boolean flag,int num)
    {
      if(flag)
      {
        System.out.print(num+ " is a sunny number");
      }
      else
      {
        System.out.print(num+ " is not a sunny number");
      }
      return flag;
    }
       
}