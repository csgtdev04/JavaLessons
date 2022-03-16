/*
@author boLondon
@date 3march2022
Game Of Chance
*/

// import anything you need for this program


import java.util.Random;
import java.util.Scanner;

public class GameOfChance {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        final int RANDOM_ANSWER = generateNumber();
        int total = 2500;
        final int GOAL = 15000;
        while (total < GOAL) {
            // keep asking for number
            System.out.print("How much do you want to bet? ");
            int betAmount = keyboard.nextInt();
            total -= betAmount;
            if (betAmount > total) {
                System.out.println("You can't afford this bet.");
            } else {
                // write code to process the bet
                System.out.print("What is your guess? ");
                int guess = keyboard.nextInt();
                int add = checkGuess(guess, RANDOM_ANSWER, betAmount);
                total += add;
            }
            System.out.println("Current account balance: $" + total);
        }
    }

    /**
     * replace with documentation
     * */
    public static int generateNumber() {
        final int BOUND = 30;
        Random random = new Random();
        return random.nextInt(BOUND) + 1; // 0 -> 29 (1 -> 30)
    }


    /**
     * replace with documentation
     * */
    public static int checkGuess(int guess, int correct, int betAmount) {
        if (guess == correct) {
            return betAmount * 2;
        } else if (guess + 1 == correct || guess - 1 == correct) {
            int temp = betAmount + (betAmount / 2);
            return temp;
        } else {
            return betAmount;
        }
    }

//    /**
//     * replace with documentation
//     * */
//    public static /*replace*/ updateAccount(/*replace*/)
//    {
//
//    } // end method
//
//
//    /**
//     * replace with documentation
//     * */
//    public static /*replace*/ gameOver(/*replace*/) {
//
//    } // end method

} // end GameOfChance.java