import java.util.Scanner;
public class Simple_fun {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter ur name");
      String name=in.next();
      System.out.println(mygreet(name));
//     System.out.println("Enter the 2nd num:");
//     int b=in.nextInt();
//      int ans=sum1(a,b);
//      System.out.println("The sum is=" +ans);
//        System.out.println("Enter the 1st num:");
//     int x=in.nextInt();
//     System.out.println("Enter the 2nd num:");
//     int y=in.nextInt();
//      int result=sum1(x,y);
//      System.out.println("The sum is=" +result);
//        System.out.println("Enter the 1st num:");
//     int c=in.nextInt();
//     System.out.println("Enter the 2nd num:");
//     int d=in.nextInt();
//      int ans1=sum1(c,d);
//      System.out.println("The sum is=" +ans1);
//        System.out.println("Enter the 1st num:");
//     int e=in.nextInt();
//     System.out.println("Enter the 2nd num:");
//     int f=in.nextInt();
//      int ans2=sum1(e,f);
//     System.out.println("The sum is=" +ans2);
   in.close();
 }
 static String mygreet(String name){
    String print="Hello  "+name;
    return print;
 }
// static int sum1(int x,int y){
//     int sum=x+y;
//     return sum;
// }
}
