import java.util.Scanner;
public class Main {
    public static void main(String [] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a fruit name:");
    String fruits=input.next();
    switch(fruits){
        case "Mango":
            System.out.println("King of fruits");
            break;
        case "Apple":
            System.out.println("A sweet red fruit");
            break;
        case "Orange":
            System.out.println("Round fruit");
            break;
        case "Grapes":
            System.out.println("Small fruit");
            break;
        default:
            System.out.println("Please enter a valid fruit");
    }
    // switch(num){
    //     case 1:
    //         System.out.println("One");
    //         break;
    //     case 2:
    //         System.out.println("Two");
    //         break;
    //     case 3:
    //         System.out.println("Three");
    //         break;
    //     case 4:
    //         System.out.println("Four");
    //         break;
    //     case 5:
    //         System.out.println("Five");
    //         break;
    //     case 6:
    //         System.out.println("Six");
    //         break;
    //     case 7:
    //         System.out.println("Seven");
    //         break;
    //     case 8:
    //         System.out.println("Eight");
    //         break;
    //     case 9:
    //         System.out.println("Nine");
    //         break;
    //     default:
    //         System.out.println("Other");
    // }
    input.close();
    }

    }
    
