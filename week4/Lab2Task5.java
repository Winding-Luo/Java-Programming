import java.util.Scanner;
public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the subtotal and gratuity rate: ");
        int subtotal=input.nextInt();
        int rate=input.nextInt();
        double gratuity=subtotal*rate*1.0/100;
        System.out.printf("The gratuity is $%.2f and total is $%.2f",gratuity,gratuity+subtotal);
    }
}
