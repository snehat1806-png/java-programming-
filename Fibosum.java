import java.util.*;
public class Fibosum{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of terms in Fibonacci series: ");
        int num=input.nextInt();
        if(num<=1){
            System.out.println("Please enter greater number");
        }else{
            int a=0,b=1,sum=a+b;
            System.out.print("Fibonacci series: "+a+" "+b);
            for(int i=2;i<num;i++){
                int c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
                sum+=c;
            }      
          System.out.println("\nSum of Fibonacci series: "+sum);
        }input.close();
    }
}
