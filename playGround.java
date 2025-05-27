
class playground {
    public static void main(String ... args)
    {
        System.out.print(number(50,2));
    }
    public static int number(int n,int m)
    {
        int temp=0;
        int sum=0;
        int sub=0;
     
        for(int i=1;i<=n;i++)
        {
            
            if(i%m==0)
            {
                temp+=i;
            }
            else
            {
                
                sum+=i;
            }
               sub=sum-temp;
            
        }
        
        return sub;
    }
   
   }