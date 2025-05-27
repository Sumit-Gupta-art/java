
class pattern
{
    public static void main(String ... args)
    {
        add(5);
    }
    public static void add(int ... a)
    {
        int count=a;
        System.out.println(count);
        for(int i=1;i<=count;i++)
        {
            int b=0;
            b=b+i;
            System.out.println(b);
        }
    }
}