import java.util.Scanner;
public class Armstrong_fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int first=sc.nextInt();
        System.out.println("Enter last number");
        int last=sc.nextInt();
        System.out.println("Armstrong numbers between "+first+" and "+last+" are:");
        for(int num=first;num<=last;num++){
            if(isArmstrong(num)){
                System.out.println(num);
            }
            
        }
        sc.close();
    }
    static boolean isArmstrong(int num){
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            digit=digit*digit*digit;
            sum=sum+digit;
            num=num/10;
        }
        return sum==original;
    }
}
