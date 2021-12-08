public class Building {
    public static void main(String[] args) {
        //ASCII ART
        //size = 7
        //      X (line 1)
        //     XXX (line 2)
        //    XXXXX
        //   XXXXXXX
        //  XXXXXXXXX
        // XXXXXXXXXXX
        //XXXXXXXXXXXXX

        //size = 6
        //      X (line 1)
        //     XXX (line 2)
        //    XXXXX
        //   XXXXXXX
        //  XXXXXXXXX
        // XXXXXXXXXXX



        // When SIZE = 1
        // Output:
        // *

        // When SIZE = 2
        // Output:
        // ...*
        // ..**
        // .***
        // ****

        // When SIZE = 3
        // Output:
        // ........* (line 1)
        // .......** (line 2)
        // ......***
        // .....****
        // ....*****
        // ...******
        // ..*******
        // .********
        // *********


        // Hint: think about relationships between the line number, size, and dots / stars
        // y = mx + b (x is line, y is dots)
        // number of dots = m * (line) + b
        // (line 1, 8 dots) => (x, y) => (1, 8)
        // 8 = -1 (1) + b => b = 9

        // y = mx + b (x is line, y is stars)
        // number of stars = m * (line) + b
        // (line 1, 1 star) => (x, y) => (1, 1)
        // 1 = 1 (1) + b => b = 0

        // dots = -1 (line) + (size * size)
        // stars = 1 (line)
        // lines = (size * size) -> Math.pow(size, 2)

        int size = 10;
        int numDots = size * size - 1;
        int numStars = size * size - numDots;
        for (int line = 1; line <= (size * size); line++) {
            // for loop to print dots
            for (int dot = 1; dot <= numDots; dot++) {
                System.out.print(".");
            }
            // for loop to print stars
            for (int star = 1; star <= numStars; star++) {
                System.out.print("*");
            }
            System.out.println();
            numDots--;
            numStars++;
        }


        // go thru the lines (for to loop thru size number of times)
        // on each line, print the spaces (for loop to go thru [formula])
        // on each line, print the xs (for loop to go thru [formula])
        // go to the next line (sout)

        // - rows depend on size
        // - spaces = decreasing
        // - number of Xs increasing

        // y = mx + b <-- equation  of a line

        // y = number of x
        // x = line
        // number of x = m (line) + b

        // y = spaces
        // x = line
        // number of spaces = m (line) + b

        // line = 2; spaces = 4
        // spaces = -1 (line) + b -> 4 = -1 (2) + b --> b = 6
        // When SIZE = 6, spaces = -1 (line) + 6

        // line = 2; x = 3
        // number of x = 2 (line) + b -> 3 = 2 (2) + b --> b = -1
        // When SIZE = 6, number of x = 2 (line) - 1


        // Calculate the spaces and number of x equation when size = 7
        // spaces = -1 (line) + b
        // line = 1; spaces = 6
        // 6 = -1 (1) + b
        // b = 7
        // When SIZE = 7, spaces = -1 (line) + 7
        // number of x = 2 (line) + b
        // line = 1; x = 1
        // 1 =  2 (1) + b
        // b = -1
        // When SIZE = 7, number of x = 2 (line) - 1

        // When SIZE = 6, spaces = -1 (line) + 6
        // When SIZE = 7, spaces = -1 (line) + 7

        // Generalized Eq: spaces = -1 (line) + SIZE

        //                y           = m (x)    + b
        // When SIZE = 6, number of x = 2 (line) - 1
        // When SIZE = 7, number of x = 2 (line) - 1

        // Generalized Eq: number of x = 2 (line) - 1

        // for loop (definite loop)
        // for(start; how long you want to do it; how do you get there)


        // |||||||
        //  |||||
        //   |||
        //    |

//        int size = 10;
//        for(int line = 1; line <= size; line++) {
//            // print out the spaces (-1 (line) + SIZE)
//            for(int space = 1; space <= -1 * line + size; space++) {
//                System.out.print(" ");
//            }
//            // print out the x's (2 (line) - 1)
//            for(int x = 1; x <= 2 * line - 1; x++) {
//                System.out.print("X");
//            }
//            System.out.println();
//        }
//        // ...
//
//
//        for(int line = 1; line <= size; line++){
//            for(int space = 1; space <= -1 * line + size; space++) {
//                System.out.print(" ");
//            }
//            for(int x = 1; x <= 2 * line -1; x++) {
//                System.out.print("|");
//            }
//            System.out.println();
//        }
//
//

    }
}
