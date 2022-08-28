public class Laep7 {
    //How do you get the first character of a string? The last character? How do you
    //remove the first character? The last character?
    public static void main(String[] args)
    {
        String x ="Hello";
        System.out.println(x.charAt(0));
        System.out.println(x.charAt(4));
        String n;
        n=x.substring(1,x.length()-1);
        System.out.println(n);


    }
}
