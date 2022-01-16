import java.util.Scanner;

public class Subway {
    public static void main(String[] args) {
        // PROBLEM: you have 3 people in a line, waiting for food
        // Keep track of how much money you make from these 3 people
        // If person wants fries, ask them how many fries ($2)
        // If person wants burger, ask them how many burger ($5)
        // If person wants drink, ask them how many drinks ($3)

        // Sample input:
        // Person 1: Fries (2), drink (3), STOP. => $13
        // "What do you want? Say STOP when you are done."
        // Fries...Ask how many...Drink...Ask how many...STOP...calculate total

        // Person 2: Burger (3), STOP. => $15
        // "What do you want? Say STOP when you are done."
        // Burger...Ask how many...STOP...calculate total

        // Person 3: Drink (2), Burger (2), STOP. => $16
        // "What do you want? Say STOP when you are done."
        // Drink...Ask how many...Burger...Ask how many..STOP..calculate total
        Scanner keyboard = new Scanner(System.in);

        int peopleInLine = 3;
        int total = 0;
        String response;
        boolean flag;

        // magic numbers: numbers that are random; they don't make sense.
        final int PRICE_OF_FRIES = 2;
        final int PRICE_OF_BURGER = 5;
        final int PRICE_OF_DRINK = 3;

        // magic strings:
        final String ITEM_1 = "fries";
        final String ITEM_2 = "burger";
        final String ITEM_3 = "drink";

        // loop to happen 'peopleInLine' times
        for (int person = 1; person <= peopleInLine; person++) {
            // make a do-while loop so you can get the user's order
            // why do we use do-while: because we don't know how many things the user wants to
            // order, and we use do-while instead of while because we need to process the loop
            // at-least once
            System.out.println("****************");
            System.out.println("Welcome to Subway!");
            System.out.println("****************");

            do {
                System.out.println("What would you like to order?");
                System.out.println("Type STOP when you finish.");
                response = keyboard.nextLine();
                flag = response.equalsIgnoreCase("STOP");

                // in case they say STOP, you don't want to ask quantity
                if (!flag) {
                    System.out.println("How many do you want?");
                    int quantity = keyboard.nextInt();
                    // rule: after using .nextInt(), make sure to include empty .nextLine()
                    keyboard.nextLine();

                    // check what the user response is and charge the right amount
                    if (response.equalsIgnoreCase(ITEM_1)) {
                        total += (PRICE_OF_FRIES * quantity);
                        // total = total + (2 * quantity)
                    } else if (response.equalsIgnoreCase(ITEM_2)) {
                        total += (PRICE_OF_BURGER * quantity);
                    } else if (response.equalsIgnoreCase(ITEM_3)) {
                        total += (PRICE_OF_DRINK * quantity);
                    } else {
                        System.out.println("Sorry, that's not on the menu.");
                    }
                }
            } while (!flag);
        }

        System.out.println("Total you made today: $" + total);
    }
}
