public class Shadowing {
   static int x=40;
    public static void main(String[] args) {
        System.out.println(x);
        //   fun();    
         x=80;
         System.out.println(x);      
         fun();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }
    static void fun(){
       int x=40;
       System.out.println(x);

    }
    
}
