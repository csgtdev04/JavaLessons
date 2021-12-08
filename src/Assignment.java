import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        // substring problem
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.nextLine();
        System.out.print("How many characters do you want to move? ");
        int numberOfLettersToTheEnd = scanner.nextInt();
        String answer = stringProblem(word, numberOfLettersToTheEnd);
        System.out.println(answer);

        String inputWord = "SAI";
        String result = getRepeatedWord(inputWord);
        System.out.println(result);

        inputWord = "SWAIN";
        result = getRepeatedWord(inputWord);
        System.out.println(result);

        // "SAI"
        // -> SAIAII
    }

    // print out the the word with one less character each time
    public static String getRepeatedWord(String inputWord) {
        String result = "";
        result += inputWord;
        result += inputWord.substring(1);
        result += inputWord.charAt(2);

        return result;
    }


    // 2 types of methods: void method (no return), return type method
    public static String stringProblem(String word, int numberOfLettersToTheEnd) {
        String result = "";
        if (numberOfLettersToTheEnd <= word.length()) {
            String portion1 = word.substring(0, numberOfLettersToTheEnd); // cs
            String portion2 = word.substring(numberOfLettersToTheEnd);
            result = (portion2 + portion1);
        } else {
            result = "INVALID";
        }
        return result;
    }


}
