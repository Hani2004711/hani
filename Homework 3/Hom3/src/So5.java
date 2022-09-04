import java.util.Scanner;

public class So5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1, number2, number3;
        System.out.print("Enter a number1 :");
        number1 = in.nextInt();
        System.out.print("Enter a number2 :");
        number2 = in.nextInt();
        System.out.print("Enter a number3 :");
        number3 = in.nextInt();
        if (number1 == number2 && number1 == number3) {
            System.out.println(number1 + "\n" + number2 + "\n" + number3 + "\nall the same");
        }
        if (number1 != number2 && number1 != number3) {
            System.out.println(number1 + "\n" + number2 + "\n" + number3 + "\n all different");
        }
        else
        {
            System.out.println(number1 + "\n" + number2 + "\n" + number3 + "\n Neither");
        }
    }
    }

//5. Write a program that reads three numbers and prints “all the same” if they
//are all the same, “all different” if they are all different, and “neither”
//otherwise.