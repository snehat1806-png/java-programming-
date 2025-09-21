import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("The character is in lowercase");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("The character is in uppercase");
        }
        else{
            System.out.println("The character is not an alphabet");
        }
        sc.close();

    }
    
}
