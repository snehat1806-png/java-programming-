import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number:");
         int num=sc.nextInt();

        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            digit=digit*digit*digit;
            sum=sum+digit;
            num=num/10;
        }
        if(sum==original){
            System.out.println(original+" is an Armstrong number");
        }
        else{
            System.out.println(original+" is not an Armstrong number");
        }

        sc.close();
        
    }
}
