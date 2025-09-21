import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        // int max=a;
        // if(b>max){
        //     max=b;
        // }
        // if(max<c){
        //     max=c;

        // }   
        int max=Math.max(a,Math.max(b,c));
        System.out.println("The greatest number is:"+max);
        input.close();
    }
}
