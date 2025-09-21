import java.util.*;
public class loop3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
          
                System.out.println("Enter 1 to inout marks and 0 if don't want");
                choice=sc.nextInt();
                if(choice==1){
                    System.out.println("Enter the marks b/W 1-100");
                    int marks=sc.nextInt();
                     if(marks<0||marks>100){
                        System.out.println("Invalid choice! Please enter as instruction is given here");
                     }else{
                        if(marks>=90){
                            System.out.println("It's Good");
                        }
                        else if(marks>=60){
                            System.out.println("Also good");
                        }
                        else{
                            System.out.println("Well good");
                        }System.out.println("Because marks does not matter but the efforts matter the most");
                     } 
                }else{
                    System.out.println("Invalid choice");
                }
        }while(choice!=0);         
        System.out.println("Program Ended");
        sc.close();
        }
    }
    

