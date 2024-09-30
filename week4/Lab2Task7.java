import java.util.Scanner;
public class Lab2Task7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance=input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles=input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price=input.nextDouble();
        double x=distance/miles*price;
        System.out.printf("The cost of driving is $%.2f",x);
    }
}
