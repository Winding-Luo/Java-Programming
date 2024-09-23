
public class class3{
    public static void main(String[] args) {
        int days=100;
        int up=days%7;
        int day=2;
        day+=up;
        switch (day) {
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thurday");
                break;
            case 5:
                System.out.println("The day is Firday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("This day is Sunday");
                break;
            default:
                break;
        }
    }
}