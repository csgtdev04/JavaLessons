public class Conditionals {
    public static void main(String[] args) {
        // if statements
        boolean weatherIsGood = false; // condition
        boolean isWeekday = true;
        if (weatherIsGood && !isWeekday) { // false && false = false
            // do some task
            System.out.println("You can play outside.");
        } else if (isWeekday) {
            System.out.println("Do VS Tutors");
        } else { // weather is bad and weekend
            System.out.println("Play video-games");
        }

        int a = 5;
        int b = 2;
        if (a == b) { // boolean condition
            System.out.println("same");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }

        // flowchart: list out all your options (3 options)
        // 4 options: 1 if, 2 else if, 1 else
        // 5 options: 1 if, 3 else if, 1 else

        int c = 5;
        if (c > 1) {
            System.out.println("c > 1");
        }
        else if (c > 2) {
            System.out.println("c > 2");
        }

        int age = 10;

        switch (age) {// glorified if statements
            case 1:
                System.out.println("you are a baby");
                break;
            case 2:
                System.out.println("you are getting older...");
                break;
            case 5:
                System.out.println("you are getting big");
                break;
            case 10:
                System.out.println("entered the double digits");
                break;
            default:
                System.out.println("i don't know what to  say...");
                break;
        }

    }
}
