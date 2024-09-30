import java.util.Scanner;
public class Lab2Task2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the time: ");
        int seconds=input.nextInt();
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        System.out.println(minutes);
        System.out.println(remainingSeconds);
    }
}
