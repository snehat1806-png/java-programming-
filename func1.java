import java.util.Scanner;

public class func1 {
    
     static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to sum:");
        int num = in.nextInt();
         for (int count = 1; count <= num; count++) {
            System.out.println("Enter number " + count + ":");
            int n = in.nextInt();
             sumFunction(n);
        }

        System.out.println("The total sum is: " + sum);

        in.close();
    }

    // Function that takes two numbers and returns their sum
    static void sumFunction(int num) {
        sum+=num;
    }
}

