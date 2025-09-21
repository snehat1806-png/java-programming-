import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        multiple( 19 ,"Sneha","CSE");
    }
    static void multiple(int a, String...v){
        System.out.println(Arrays.toString(v)+" "+a);

    }
}
