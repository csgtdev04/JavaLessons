import java.util.Scanner;

public class Example {
    // method
    public static void main(String[] args) {
        // max, min, abs, pow
        System.out.println(Math.ceil(-2.001));
        System.out.println(Math.floor(-3.999));
        System.out.println(Math.max(2.0, 3));
        System.out.println(Math.min(2.0, 3.0));
        System.out.println(Math.abs(-4.0));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.round(3.8));

        String exampleText = "What is going on";
        //                    0123456789
        // substring, indexOf, charAt, length
        String partOfExampleText = exampleText.substring(5, 7);
        System.out.println(partOfExampleText);
        String part0fExampleText2 = exampleText.substring(14);
        System.out.println(part0fExampleText2);
        String toTheEnd = exampleText.substring(5);
        System.out.println(toTheEnd);

        char c = exampleText.charAt(0);
        System.out.println(c);

        char s = exampleText.charAt(11);
        System.out.println(s);

        int length = exampleText.length();
        System.out.println(length);

        // runtime error, compile time error (syntax error)

        String randomWord = "hello";
        int indexOfE = randomWord.indexOf("e");
        System.out.println(indexOfE);

        int indexOfL = randomWord.indexOf("el");
        System.out.println(indexOfL);

        int indexOfA = randomWord.indexOf("a");
        System.out.println(indexOfA);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a valid email address: ");
        String email = scanner.nextLine();
        if (email.indexOf("@") != -1) {
            System.out.println("You're good!");
        } else {
            System.out.println("Enter a valid email address: ");
            email = scanner.nextLine();
        }
    }
    // many other methods
}
