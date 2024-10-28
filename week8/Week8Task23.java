import java.util.Scanner;

public class Week8Task23 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double []a = new double[10];
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextDouble();
        }

        
        double []b = new double[10];
        System.out.println("This is the primary numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
            b[10 - i - 1] = a[i];
        }

        
        System.out.println();
        System.out.println("This is the reverse numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i]);
            System.out.print(" ");

        }
        System.out.println();
    }
}
