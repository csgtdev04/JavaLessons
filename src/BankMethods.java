// any necessary import statements
import java.util.Scanner;


public class BankMethods {
    private static final String DEPOSIT = "deposit";
    private static final String WITHDRAW = "withdraw";
    private static final String INTEREST = "interest";
    // 1. construct your System.in scanner
    private static final Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        // 2. establish relevant variables
        System.out.println("Enter your balance: ");
        double balance = sc.nextDouble();
        boolean userWantsToContinue = true;
        // 3. loop to let user manipulate accounts
        while (userWantsToContinue) {
            sc.nextLine();
            System.out.println("What are you doing with your money?(Deposit/Withdraw/Interest)[Press enter when you are finished]");
            String todo = sc.nextLine();

            double amount = 0;
            if (todo.equalsIgnoreCase(DEPOSIT) || todo.equalsIgnoreCase(WITHDRAW)) {
                System.out.println("How much do your want to " + todo.toLowerCase() + "?");
                amount = sc.nextDouble();
            } else if (todo.equalsIgnoreCase(INTEREST)) {
                balance = applyInterest(balance);
                System.out.println("Interest has been calculated");
            } else {
                System.out.println("Done.");
                userWantsToContinue = false;
            }
            // ternary
            balance = todo.equalsIgnoreCase(DEPOSIT) ? deposit(balance, amount) :
                    withdraw(balance, amount);
        }


        // 4. print account balance after user returns null
        System.out.printf("Calculations ended, your final balance is $%.2f", balance);


    } // end main()


    /**replace with method documentation
     *
     * */
    // public static /*replace with keyword*/ deposit(/*replace with @params*/)

    public static double deposit(double bal, double amtToDeposit){
        return bal + amtToDeposit;
    }
    /**replace with method documentation
     *
     * */
    public static double withdraw(double bal, double amtToWithdraw){
        // ternary operator
        String print = "You do not have the nessecary funds and can not make this withdrawal, " +
                "your balance is still: $\"+bal";
        System.out.println((bal >= amtToWithdraw) ? "" : print);
        return (bal >= amtToWithdraw) ? bal - amtToWithdraw : bal;
    }

    /**replace with method documentation
     *
     * */
    public static double applyInterest(double bal)
    {  return deposit(bal ,bal*0.025);
    }
} // end BankMethods