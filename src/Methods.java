import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // main will get cluttered
//        System.out.println(fav(7));

        boolean result1 = isEven(10);
        boolean result2 = isEven(5);
        System.out.println(result1 + " " + result2);

        // for loop: make a method to print out numbers from 1 -> some number the user passes in
        // - you want to get the input from the user

        printNumbersTill(10);

        // Print out the details of a person
        printPersonDetails();

        // Return the sum of 2 numbers
//        int a = 10;
//        int b = 10;
//        int sum = addTwoNums(a, b);
//        System.out.println(sum);


        // 1. Print out how many candies you have (candies is a parameter)
        // 2. Return the division of 2 numbers (2 numbers are parameters)

        Scanner scan = new Scanner(System.in);
        System.out.print("How many candies do you have? ");
        int a = scan.nextInt();
        candies(a);

        System.out.print("Enter the first number: ");
        int b = scan.nextInt();
        System.out.print("Enter the second number: ");
        int c = scan.nextInt();
        double res = divide(b, c);
        System.out.println(res);
    }

    public static void candies(int numCandies){
        System.out.println("You have " + numCandies + " candies");
    }

    public static double divide(int num, int den) {
        return num / den;
    }

    public static int addTwoNums(int input1, int input2) {
        return input1 + input2; // return type is integer
    }

    public static void printPersonDetails() {
        System.out.println("Swain");
        System.out.println("D'mello");
        System.out.println(16);
        System.out.println("Jasper High School");
    }

    // public static ___ name(parameters) {
    // ....
    // }

    public static void printNumbersTill(int lastNum) {
        for (int i = 1; i <= lastNum; i++) {
            System.out.println(i);
        }
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // blah
    public static double fav(int userFavNum) {
        System.out.println(":)");
        System.out.println(":)");
        return userFavNum;
    }
}
