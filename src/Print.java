public class Print {
    public static void main(String[] args) {

        // print out 2 ints and 2 double and round the first double to the tenths place and the
        // 2nd double to the thousandths place
        // make sure you go to the next line

        practiceQuestion();
        questionAboutPrintf();
        // println
        System.out.println("Hello");
        System.out.println("Bye");
        String name = "Swain";
        int age = 16;
        String name1 = "Saio";
        System.out.println("My name is " + name + ". and my age is " + age);
        // print
        System.out.println();
        // escape sequences (\n, \t, \")
        System.out.print("Hello\n");
        System.out.print("Bye");
        System.out.println();
        // printf
        // simplify concatenation, hidden features (round numbers to the nearest tenth, hund.,
        // thous.)
        // %s is a placeholder for String values
        // %d is a placeholder for int values
        // %f is a placeholder for double values
        // %% is a placeholder for %
        System.out.printf("My name is %s. My age is %d. I got a 100%%\n", name, age);
        double value = 2.312345;
        System.out.printf("%.1f", value);
    }

    public static void questionAboutPrintf() {
        // %d = int (placeholder)
        // %s = string (words)
        // %f = double (decimals) - %.1f - round the tenths place
        // %% = %
        // %,d = adds commas to your integer number (1,000)
        int num1=18;
        int num2= 7;
        double num3= 11.987; //11.0
        double num4= 20; //20.0 -> 20.000
        String name = "Sai";

        System.out.printf("Hello my name, is %s. My age, is %d. My double val is %.1f\n", name,
                num1, num3);
        System.out.printf("%d, %d, %.1f, %.3f\n", num1, num2, num3, num4);
        System.out.printf("");
    }

    public static void practiceQuestion() {
        int n1, n2;
        double n3, n4;
        n1 =2348;
        n2 =2346;
        n3 =2345.2345;
        n4 =58.4578;
        System.out.println("n1 equals " + n1);
        System.out.println("n2 equals " + n2);
        System.out.println("n3 equals " + n3);
        System.out.println("n4 equals " + n4);
        System.out.println();
        System.out.printf("n3 rounded to the tenths' place equals %.1f",n3);
        System.out.println();
        System.out.printf("n4 rounded to the thousandths' place equals %.3f",n4);
        System.out.println();
    }
}
