public class Q_5 {
    public static void main(String[] args) {
//5. The StringBuilder class has a method for reversing a string. In a ReverseTester class, construct a StringBuilder from a given string (such as "desserts"), call the reverse method followed by the toString method, and print the result. Also print the expected value.
        StringBuilder o=new StringBuilder("homework_java");

        o.reverse();

        System.out.println("the actual result is : "+o+"\nthe expected is : avaj_krowemoh");
    }
}
