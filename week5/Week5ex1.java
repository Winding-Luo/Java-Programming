import java.util.Scanner;
public class Week5ex1 {
    public static void main(String[] args) {
        System.out.print("Enter two character: ");
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        if(a.charAt(1)>='1'&&a.charAt(1)<='4'){
            if(a.charAt(0)=='M'||a.charAt(0)=='C'||a.charAt(0)=='I'){
                if(a.charAt(0)=='M'){
                    System.out.print("Mathematics ");
                }else if(a.charAt(0)=='C'){
                    System.out.print("Computer Science ");
                }else if(a.charAt(0)=='T'){
                    System.out.print("Information Techology ");
                }
                if(a.charAt(1)=='1'){
                    System.out.println("Freshman");
                }else if(a.charAt(1)=='2'){
                    System.out.println("Sophomore");
                }else if(a.charAt(1)=='3'){
                    System.out.println("Junior");
                }else{
                    System.out.println("Senior");
                }
            }else{
                System.out.println("Invalid input");
            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
