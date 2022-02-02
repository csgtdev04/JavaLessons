public class ConditionalTest {
    public static void main(String[] args) {
        // FizzBuzz
        // The task is simple: Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
        // “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.

        int N = 50;
        for (int number = 1; number < N; number++) {
            int a=number%5;
            int b=number%3;
            if (a==0 && b==0){
                System.out.println("FizzBuzz");
            } else if(a==0){
                System.out.print("Buzz");
            } else if(b==0){
                System.out.println("Fizz");
            } else {
                System.out.print(number);
            }
        }

    }
}
