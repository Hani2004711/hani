import java.awt.*;

public class Q_4 {
    //4. Look into the API documentation of the Rectangle class and locate the method void add(int newx, int newy) Read through the method documentation. Then determine the result of the following statements:
    //Rectangle box = new Rectangle(5, 10, 20, 30);
    //box.add(0, 0);
    //Write a program AddTester that prints the expected and actual location, width, and height of box after the call to add.
    public static void main(String[] args)
    {

        Rectangle box=new Rectangle(5, 10,20,30);

        System.out.println("#you are now in method (AddTester).");


        box.add(0,0);


        System.out.println(" actual height is : "+box.height+" \nactual width is : "+box.width+"\n actual X is : "+box.x +" \n actual Y is : "+box.y);
        System.out.println("""
                
                
                expected height is : 40\s
                expected width is : 25
                expected X is : 0
               expected Y is : 0""");
    }
}
