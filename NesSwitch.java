import java.util.Scanner;
public class NesSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a id:");
        int id=in.nextInt();
        String dep=in.next();
        switch(id){
            case 123:System.out.println("Sneha");
            break;
            case 456:System.out.println("XYZ");
            switch(dep){
                case"IT":System.out.println("IT Department");
                break;
                case"CS":System.out.println("CS Department");
                break;
            }
            break;
          case 789:System.out.println("ABC");
          break;
            default:System.out.println("Invalid id");


    }
    in.close();
    
}
}