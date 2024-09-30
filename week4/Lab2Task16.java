import java.util.Scanner;
public class Lab2Task16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        boolean isLeapYear=(year%4==0);
        isLeapYear=isLeapYear&&(year%100!=10);
        isLeapYear=isLeapYear||(year%400==0);
        isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
        if(isLeapYear){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
