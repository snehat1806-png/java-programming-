public class Pattern7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            //spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    //     for(int i=1;i<=5;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1");
    //         }else{
    //             System.out.print("0");
    //         }
    //     }
    //     System.out.println();
    // }
   
}
}