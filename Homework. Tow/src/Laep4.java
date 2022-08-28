import java.util.Scanner;
//. Write a Java program that takes three numbers as input to calculate and print
     //   the average of the numbers.//
public class Laep4 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x,c,v;

       System.out.print("entr the number  1 :");
        x =in.nextInt();
        System.out.print("entr the number 2 :");
        c =in.nextInt();
        System.out.print("entr the number 3 :");
        v =in.nextInt();
        System.out.println("Arg ="+(x+c+v)/3);
    }
}
