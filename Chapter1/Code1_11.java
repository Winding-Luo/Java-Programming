import java.util.Scanner;
public class Code1_11 {
    public static void main(String[] args) {
        long totalPeople=312032486;
        long totalSeconds=365*24*60*60;
        totalPeople=(long)(totalPeople+(1.0*totalSeconds/7)-(1.0*totalSeconds/13)+(1.0*totalSeconds/45));
        System.out.println(totalPeople);
    }
}
