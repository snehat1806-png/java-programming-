public class Pattern8 {
    public static void main(String[] args) {
       //palindromic num
       for(int i=1;i<=5;i++){
        //spaces
        for(int j=1;j<=5-i;j++){
            System.out.print(" ");
        }
        //first half
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        //second half
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
          //pyramid
        // for(int i=1;i<=5;i++){
        //     //spaces
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
    }
    
}
