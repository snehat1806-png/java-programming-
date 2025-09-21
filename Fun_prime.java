import java.util.Scanner;
public class Fun_prime {
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        boolean isPrime=true;
        if(n<=1)
        {
            isPrime=false;
        }
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            
            }
        
        if(isPrime)
        {
            System.out.println(n+" is a prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number");
        }
        in.close();
    }
}
