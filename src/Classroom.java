import java.util.Scanner;

public class Classroom {

    private static final Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) {
        int age = 16;
        String name = "Swain";
        double gpa = 4.045;
        Student student1 = new Student(age, name, gpa);

        System.out.println("Do you want to view something (yes, no)?");
        String view = KEYBOARD.nextLine();
        if (view.equalsIgnoreCase("yes")) {
            System.out.println("What do you want (name, age, gpa)?");
            String what = KEYBOARD.nextLine();
            if (what.equalsIgnoreCase("name")) {
                System.out.println("student name: " + student1.getName());
            } else if (what.equalsIgnoreCase("age")) {
                System.out.println("student age: " + student1.getAge());
            } else if (what.equalsIgnoreCase("gpa")) {
                System.out.println("student gpa: " + student1.getGpa());
            } else {
                System.out.println("Invalid input.");
            }
        }

        Student student2 = new Student();

        System.out.println("What name would you like?");
        String userName = KEYBOARD.nextLine();
        student2.setName(userName);
        System.out.println("student name: " + student2.getName());

        System.out.println("What age would you like?");
        int userAge = KEYBOARD.nextInt();
        student2.setAge(userAge);
        System.out.println("student age: " + student2.getAge());

        System.out.println("What gpa would you like?");
        double userGPA = KEYBOARD.nextDouble();
        student2.setGpa(userGPA);
        System.out.println("student gpa: " + student2.getGpa());

    }

}
