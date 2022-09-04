import java.util.Scanner;

public class So6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter a number One :");
        number1 = in.nextInt();

        System.out.print("Enter a number tow :");
        number2 = in.nextInt();

        System.out.print("Enter a number3 Three:");
        number3 = in.nextInt();

        if (number2==number1+1&&number3==number2+1)
            System.out.println("Increasing");

       else if (number2==number1-1&&number3==number2-1)
            System.out.println("decreasing");

       else
            System.out.println("neiter");
        }

    }
    //6. Write a program that reads three numbers and prints “increasing” if they
//are in increasing order, “decreasing” if they are in decreasing order, and
//“neither” other wise. Here, “increasing” means “strictly increasing”, with
//each value larger than its predecessor. The sequence 3 4 4 would not be
//considered increasing
