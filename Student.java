package Level_1;

// Write a Java program to create a class called "Student" with instance variables "name," "age," and "ID." Include a method to print the name and age of the student.

public class Student {

    private String name;
    private int age;
    private int ID;

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + ID);
    }

    public static void main(String[] args) {
        Student student = new Student("Shubh", 22, 2197);
        student.printDetails();
    }
}
