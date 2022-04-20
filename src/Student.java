public class Student {
    private int age;
    private String name;
    private double gpa;

    public Student() { // default const - no need of anything in ()
        // when to use "this."
        this.age = 18;
        this.name = "Sai";
        this.gpa = 4.0;
    }

    public Student(int age, String name, double gpa) {
        this.age = age;
        this.name = name;
        this.gpa = gpa;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        System.out.println("SCREW YOU OBJECT toString()");
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
