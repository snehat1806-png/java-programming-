//import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the number of terms in Fibonacci series: ");
        // int num = input.nextInt();
        // if (num <= 0) {
        //     System.out.println("Please enter a positive integer.");
        // } else {
        //     int a = 0, b = 1;
        //     System.out.print("Fibonacci series: ");
        //     for (int i = 0; i < num; i++) {
        //         System.out.print(a + " ");
        //         int next = a + b;
        //         a = b;
        //         b = next;
        //     }
        // }
        // input.close();
        int a=0;
        int b=1;
        int n=4;
        int counter=2;
        if(n==0){
            System.out.println(a);
            return;
        }else if(n==1){
            System.out.println(b);
            return;
            }
        while(counter<=n){
                int temp=b;
                b=a+b;
                a=temp;
                counter++;
            }
            System.out.println("Fibonachi number at position "+n+" is: "+b);
            
        }

    }
