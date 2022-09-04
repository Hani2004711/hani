import java.util.Scanner;

public class So7 {
    public static void main(String[] args) {
        for (int x = 10; x >= 10; x++) {

            Scanner in = new Scanner(System.in);
            int n1, n2, n3;
            System.out.print("Enter a number n1 :");
            n1 = in.nextInt();
            System.out.print("Enter a number n2 :");
            n2 = in.nextInt();
            System.out.print("Enter a number n3 :");
            n3 = in.nextInt();
            if ((n1 <= n2 && n2 >= n3) || (n1 < n2 && n2 <= n3) || (n1 > n2 && n2 >= n3) || n1 >= n2 && n2 > n3) {
                System.out.println("In order");
            } else {
                System.out.println("Not in order");
            }
        }
    }
}
//7. Write a program that reads in three integers and prints “in order” if they
//are sorted in ascending or descending order, or “not in order” otherwise.
//For example,
//1 2 5 in order
//1 5 2 not in order
//5 2 1 in order
//1 2 2 in order
