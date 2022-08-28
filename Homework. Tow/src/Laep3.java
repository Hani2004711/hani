import java.util.Scanner;

public class Laep3 {
    //. Write a Java program to print the area and perimeter of a rectangle.//
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        float x,d,Aaer,Perimeter;

        System.out.print("Entar The x :");
        x=in.nextFloat();
        System.out.print("Entar The d :");
        d=in.nextFloat();
        Aaer=(x*d);
        Perimeter=(x*d)*2;
        System.out.println("Area ="+Aaer);
        System.out.println("perimeter ="+ Perimeter);
    }

}
