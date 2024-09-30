
import java.util.Scanner;
public class Lab2Task17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if(x<10){
            System.out.println("0"+x);
        }else{
            System.out.println(x);
        }
    }
}
