import java.util.Scanner;
//Write a Java program to swap two variables.
public class Laep5 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x,y,t;
            System.out.print("entr the num x :");

            x =in.nextInt();
          System.out.print("entr the num  :");
          y =in.nextInt();
            t=y;
            y=x;
            x=t;

          System.out.println("x="+x);
          System.out.println("y="+y);
    }
}
