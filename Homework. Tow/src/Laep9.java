import java.util.Scanner;

public class Laep9 {
//Write a program that prompts the user for two integers and then prints
//• The sum
//• The difference
//• The product
//• The average
//• The distance (absolute value of the difference)
//• The maximum (the larger of the two)

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number1,number2,sum,product,distance,max,min,difference;

        System.out.println(" enter the number1: ");
        number1=input.nextInt();
        System.out.println(" enter the number2: ");
        number2=input.nextInt();
        sum=number1+number2;
        System.out.println("sum= "+sum);
        difference=number1-number2;
        System.out.println("difference= "+difference);
        product=number1*number2;
        System.out.println("product=" +product);

        float average=((float) number1+number2)/2;

        System.out.println("average= "+average);
        distance=Math.abs((number1-number2));
        System.out.println("distance= "+distance);
        max=Math.max(number1,number2);
        System.out.println("the max number is: "+max);
        min=Math.min(number1,number2);
        System.out.println("the min number is: "+min);
    }
}
