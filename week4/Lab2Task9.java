import java.util.Scanner;
public class Lab2Task9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double total=input.nextDouble();
        double rate=input.nextDouble();
        rate=(rate/100)/12;
        int month=input.nextInt();
        for(int i=1;i<=month;i++){
            total*=(1+rate);
        }
        System.out.println(total);
    }
}
