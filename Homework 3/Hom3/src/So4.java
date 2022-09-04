import java.util.Scanner;

public class So4 {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int n;
        System.out.print("Enter a number :");
        n =in.nextInt();
        if (n>0)
        {
           n=n;
        }
        if (n<0)
        {
            n=n*-1;

        }
        if (n<10)
            System.out.println(n+"\nthe size is :"+1);
        else if (n<100)
            System.out.println(n+"\nthe size is :"+2);
        else if (n<1000)
            System.out.println(n+"\nthe size is :"+3);
        else if (n<10000)
            System.out.println(n+"\nthe size is :"+4);
        else if (n<100000)
            System.out.println(n+"\nthe size is :"+5);
        else if (n<1000000)
            System.out.println(n+"\nthe size is :"+6);
         else if (n<10000000)
            System.out.println(n+"\nthe size is :"+7);
        else if (n<100000000)
            System.out.println(n+"\nthe size is :"+8);
       else System.out.println("thi number is very big");

    }
}
//4. Write a program that reads an integer and prints how many digits the
//number has, by checking whether the number is ≥ 10, ≥ 100, and so on.
//(Assume that all integers are less than ten billion.) If the number is
//negative, first multiply it with –1.