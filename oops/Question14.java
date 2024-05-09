import java.util.Scanner;

class NegativeException extends Exception
{
    NegativeException(String s)
    {
        super(s);
    }
}

class Question14
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int c=0;

        System.out.println("Enter count of numbers");
        int n=s.nextInt();
        
        System.out.println("Enter "+n+" positive numbers");
        for(int i=0;i<n;++i)
        {
            try
            {
                int num=s.nextInt();

                if(num<0)
                {
                    i--;
                    throw new NegativeException("Negative Input\nEnter "+(n-i-1)+" more Positive numbers");
                }
                else
                {
                    sum=sum+num;
                }

            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
        double avg=(double)sum/n;
        System.out.println("\nAverage of positive numbers : "+avg);
    }
}