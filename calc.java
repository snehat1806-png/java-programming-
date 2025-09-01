import java.util.Scanner;
public class calc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println("the sum of a&b is:"+sum);
        // int diff=a-b;
        // System.out.println("The difference of a&b is:"+diff);
        // int mul=a*b;
        // System.out.println("The multiplication of a&b is:"+mul);
        // int div=a/b;
        // System.out.println("The division of a&b is:"+div);
        // int mod=a%b;
        // System.out.println("The modulo of a&b is:"+mod);
        System.out.println("Choose the op you wanna to perform:");
        int choice=sc.nextInt();

        switch(choice){
            case 1:int sum=a+b;
            System.out.println("The sum of a&b is:"+sum);
            break;
            case 2:int diff=a-b;
            System.out.println("The difference of a&b is:"+diff);       
            break;
            case 3:int div=a/b;
            System.out.println("The division of a&b is:"+div);
            break;
            case 4:int mul=a*b;     
            System.out.println("The multiplication of a&b is:"+mul);
            break;
            case 5:int mod=a%b;
            System.out.println("The modulo of a&b is:"+mod);
            break;
            default:System.out.println("Invalid input");
            break;

        }
                      
        sc.close();

    }
}
