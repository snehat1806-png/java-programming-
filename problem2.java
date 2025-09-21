import java.util.Scanner;
public class problem2 {
    public static void main( String[]args){
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter the radius of circle:");
     double radius=sc.nextDouble();
      double pi=3.14f;
      double area=pi*radius*radius;
      System.out.println("The radius of circle is:\n"+radius+"\nThe area of circle is:\n"+area);
      sc.close(); 
      
  }
}
