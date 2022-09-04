import java.util.Scanner;

public class So3 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int number;
        System.out.print("enter the number :");
        number =in.nextInt();
        if(number >0)
        {
            System.out.println("+"+number);
        }
        if (number < 0)
        {
            System.out.println(number);
        }
        if (number==0)
        {
            System.out.println("zero");
        }
    }
}
//3. Write a program that reads an integer and prints whether it is negative,
//zero, or positive
