public class Loops {
    public static void main(String[] args) {
        // loop that executes some task over and over until your condition
        // condition : print hi, 10 times (0 -> 9; 1 -> 10)
        // 2 types: for (definite loop), while (indefinite)

        // for: definite loop - loop that happens a SPECIFIED amount of times
        // while: indefinite loop - loop where we don't specify number of times to run (but we
        // give a condition); keeps running until condition is false
        // do-while: loop that happens once regardless of if the condition is T/F, then checks the
        // conditions, and proceeds like a while loop

        for (int i = 1; i <= 50; i++) {
            System.out.println("Hi");
        }

//        - make a for loop to print numbers from 1 - 100 (go by 1s)
        for (int a = 1; a < 101; a += 2) {
            System.out.print(a);
        }

//        - make a for loop to print numbers from 1 - 100 (go by 5s)
        for (int a = 1; a < 101; a += 5) {
            System.out.print(a);
        }

//        - make a for loop to print all the odd numbers from 1- 100
//        int a = 2;
//        // ternary expression (simplifies an if / else statement)
//        System.out.println(a % 2 == 0 ? "Even" : "Odd");
        System.out.println();
        System.out.println();
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) { // 1 % 2 = 1 ; 5 % 2 = 1
                System.out.print(i);
            }
        }

//        - make a for loop to print numbers from 100 - 1 (decrement by 1)
        for (int a = 100; a > 0; a--){
            System.out.println(a);
        }

//        - make a for loop to print numbers from 100 - 1 (decrement by 5)
        for (int a = 100; a > 0; a -= 5){
            System.out.println(a);
        }


        boolean hungry = true;
        System.out.println(hungry ? "Im hungry" : "full");

        // ternary problem
        // if a variable called 'happy' is true - print out 'yay', otherwise print
        // 'sad'

        // tough for loop problem (2d for loops, nested loops)
        // print this sequence:
        // 12345
        // 23456
        // 34567
        // 45678


        // hint: each row - (1-4) outer loop; inner loop, outer loop num + 4


        // while

        int a = 10;
        while (a > 0) { // 10 - 1 -> 0 >/ 0
            // inside part keeps running until condition is true
            System.out.println(a);
            a--; // 10 -> 9 -> 8 -> .... -> 1 -> 0
        }


        // do-while
        int b = 7;
        do { // even tho the condition is false, it will still occur once
            System.out.println("Although " + b + " is less than 5, it still happens once");
            b--;
        } while(b > 5);


        // Practice
        // IF, ELSE IF, ELSE: make a system where if (user == 10) -> ____, else if (user == 15),
        // -> ___, else ->
        // FOR LOOP: print from 1 - 10; only even numbers
        // WHILE: print "Hello" 5 times (seems like a for loop problem)



    }
}
