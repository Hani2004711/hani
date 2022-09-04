import java.util.Scanner;

public class So9 {
    public static void main(String[] args) {
        for (int x=10;x >10; x++)
        {
            Scanner in = new Scanner(System.in);
            double mon, day;
            String season = "Winter", season1 = "Spring", season2 = "Summer", season3 = "Fall";
            System.out.print("enter the month: ");
            mon = in.nextDouble();

            System.out.print("enter the day: ");
            day = in.nextDouble();
            if (mon == 1 || mon == 2 || mon == 3) {
                if (mon % 3 == 0 && day > 21)
                    System.out.println("the season is : " + season1);

                else
                    System.out.println("the season is : " + season);
            }

            if (mon == 4 || mon == 5 || mon == 6) {
                if (mon % 3 == 0 && day > 21)
                    System.out.println("the season is : " + season2);
                else
                    System.out.println("the season is : " + season1);
            }

            if (mon == 7 || mon == 8 || mon == 9) {
                if (mon % 3 == 0 && day > 21)
                    System.out.println("the season is : " + season3);
                else
                    System.out.println("the season is : " + season2);
            }

            if (mon == 10 || mon == 11 || mon == 12) {
                if (mon % 3 == 0 && day > 21)
                    System.out.println("the season is : " + season);
                else
                    System.out.println("the season is : " + season3);
            }
        }
    }
}