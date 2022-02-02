import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int NUM_PEOPLE_IN_LINE = 2;
        Scanner scanner = new Scanner(System.in);

        // at-least one person in line, so we use a do-while loop
        do {
            // Ask user for name
            String name = scanner.nextLine();
            // Ask user for order
            String order = scanner.nextLine();
            System.out.println(name + " ordered " + order);

            NUM_PEOPLE_IN_LINE--;
        } while (NUM_PEOPLE_IN_LINE > 0);
    }
}
