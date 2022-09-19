public class Q_2 {
//2. Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii" and print the length of the resulting string. In that string, replace all "ss" with "s" and print the length of the resulting string.
        public static void main(String[] args) {
            String woword="Mississippi",wword;


            System.out.println("the new word : "+wword.replaceAll("i","ii"));
            woword=wword.replaceAll("i","ii");



            System.out.println("the length of this word : "+wword.length());
            System.out.println("______________________");

            System.out.println("word : "+        wword.replace("ss","s"));
           wword=wword.replace("ss","s");




            System.out.println("of this word : "+wword.length());
        }
    }


