import java.util.Scanner;
//Write a program that reads a number and displays the square, cube, and fourth
//power. Use the Math.pow method only for the fourth power
public class Laep8 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        double n1;
        double square,cube,fourthpower;
        System.out.println("enter the numder :");
        n1 =in.nextDouble();
        square=(n1*n1);
        System.out.println("square="+square);
        cube=(n1*n1*n1);
        System.out.println("cube="+cube);
       fourthpower=Math.pow(n1,4);
       System.out.println("power for number is ="+fourthpower);


    }
}
