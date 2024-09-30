import java.util.Scanner;
public class Lab2Task6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds=input.nextDouble();
        System.out.print("Enter height in inches ");
        double inches=input.nextDouble();
        double BMI=pounds*0.45359237/((inches*0.0254)*(inches*0.0254));
        System.out.println("BMI is "+BMI);
    }
}
