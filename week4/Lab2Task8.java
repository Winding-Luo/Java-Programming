import java.util.Scanner;
public class Lab2Task8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the length of the side: ");
        double length=input.nextDouble();
        double area=length*length*(3*Math.sqrt(3*1.0)/2);
        System.out.println("The area of the hexagon is "+area);
    }
}
