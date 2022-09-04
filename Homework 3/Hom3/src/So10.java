import java.util.Scanner;

public class So10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v;
        System.out.println("1=January\n2=february\n3=March\n4=April\n5=May\n6=june\n7=july\n8=Augst\n9=Septemer\n10=october\n11=November\n12=December");
        v = in.nextInt();
        switch (v) {


            case 1:
                System.out.println("January\nday=31");
                break;
            case 2:
                System.out.println("february\nday=28ro29");
                break;
            case 3:
                System.out.println("March\nday=31");
                break;
            case 4:
                System.out.println("April\nday=30");
                break;
            case 5:
                System.out.println("May\nday=31");
                break;
            case 6:
                System.out.println("june\nday=30");
                break;
            case 7:
                System.out.println("july\nday=31");
                break;
            case 8:
                System.out.println("Augst\nday=31");
                break;
            case 9:
                System.out.println("Septemer\nday=30");
                break;
            case 10:
                System.out.println("october\nday=31");
                break;
            case 11:
                System.out.println("November\nday=30");
                break;
            case 12:
                System.out.println("December\nday=31");
                break;
            default:
                System.out.println("erar");
        }
    }
}