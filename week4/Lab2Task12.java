import java.util.Scanner;
public class Lab2Task12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x=input.nextInt();
        if(x%2==0){
            System.out.println("HiEven");
        }
        if(x%5==0){
            System.out.println("HiFive");
        }
    }
}
