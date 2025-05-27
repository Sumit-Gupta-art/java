import java.util.Scanner;
class palindrome
{
    
    static Scanner sc=new Scanner(System.in);
    public static void main(String ... args)
    {
        System.out.print("Enter a value: ");
        String userInput=sc.nextLine();
        char a,b;
        a = 'b';
        b = 'c';
        if(a==b){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        String value = reverse(userInput);
        check(userInput, value);
    }
    public static String reverse(String value)
    {
        String store = "" ;
        for(int i=0;i<value.length();i++)
        {
            char c = value.charAt(i); 
            store=c+store;
        }
        System.out.println(store.length());
        return store;
    }
    public static void check(String ogValue,String revers)
    {
        if(ogValue.equals(revers))
        {
            System.out.println("in the loop");     
        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
}