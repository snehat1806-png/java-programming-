import java.util.*;
public class loop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not Prime number");
        } else {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {  
                    System.out.println("Not Prime number");
                    break;
                }
            }
            if (i == num) { 
                System.out.println("Prime number");
            }
        }

        sc.close();
    }
}
