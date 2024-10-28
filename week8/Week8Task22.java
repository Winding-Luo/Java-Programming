import java.util.Scanner;

public class Week8Task22 {
    public static void main(String[] args) {
        double [] a = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextDouble();
        }
        double minv = min(a);
        System.out.println("The minimun number is: " + minv);
    }
    public static double min(double[] a) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
