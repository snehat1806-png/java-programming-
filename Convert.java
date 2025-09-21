import java.util.Scanner;
public class Convert {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the temperature in celcius:");
        float celcius=in.nextInt();
        float fahrenheit=(celcius*9/5)+32;
        System.out.println("The temperature in fahrenhite is :" +fahrenheit);
        in.close();

    }
}
