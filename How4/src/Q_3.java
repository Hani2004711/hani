public class Q_3 {
    public static void main(String[] args) {
        String word="Mississippi",new_;
        //         3. Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!" and all letters "s" with "$". Use the replace method. Demonstrate that
        System.out.println("the word : "+word);

        System.out.println("\n \n");


        word.replaceAll("i","!");

        System.out.println("\n \n");

        System.out.println(" encrypted word : "+word.replace("s","$"));
        System.out.println("\n \n");

        System.out.println("answer is : M!$$!$$!pp!");

    }
}
