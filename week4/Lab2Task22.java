import java.util.Scanner;
public class Lab2Task22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x=input.nextInt();
        int a=input.nextInt();
        switch (a) {
            case 1:
                x+=5;
                break;
            case 2:
                x+=10;
                break;
            case 3:
                x+=16;
                break;
            case 4:
                x+=34;
                break;
        }
        System.out.println(x);
    }
}
