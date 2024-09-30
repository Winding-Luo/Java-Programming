import java.util.Scanner;
public class Lab2Task10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double total=input.nextDouble();
        double rate=input.nextDouble();
        rate=(rate/100)/12;
        int month=input.nextInt();
        for(int i=1;i<month;i++){
            total=(100+total)*(1+rate);
        }
        System.out.printf("%.2f",total);
    }
}
