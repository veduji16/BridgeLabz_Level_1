package Level_1;

//  Write a Java program to create a class called "Circle" with an instance variable "radius." Include a method to calculate the area of the circle and a method to calculate the circumference of the circle.

public class Circle {
    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7.0);

        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
