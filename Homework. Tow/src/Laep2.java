import java.util.Scanner;

public class Laep2 {
    public static void main(String[] args)
    {
        //2. Write a Java program to print the area and perimeter of a circle ,//
        Scanner in=new Scanner(System.in);
        double x,y,Area,Perimeter;
        System.out.print("Enter The Radius :");
        y=3.14;
        x= in.nextDouble();
        Area=(y*x*x);
        Perimeter=x*2*y;

        System.out.println("Area="+Area);
        System.out.println("Perimeter"+Perimeter);


    }
}
