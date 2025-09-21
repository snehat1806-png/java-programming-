public class Fun_overloading {
    public static void main(String[] args) {
     
        System.out.println(sum(6,7)); // Calls the method with two int parameters
        System.out.println(sum(5.5678, 10.5)); // Calls the method with two double parameters
        System.out.println(sum(5, 10, 15)); // Calls the method with three int parameters
    }
    
    // Method to sum two integers
    static int sum(int a, int b) {
        return a + b;
    }
    // Method to sum two doubles
    static double sum(double a, double b) {
        return a + b;
    }
    // Method to sum three integers
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
