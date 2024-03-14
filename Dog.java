package Level_1;

//     Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight." Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, and weight.

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public int calculateAgeInHumanYears() {
        int humanYears;

        if (age <= 2) {
            humanYears = age * 11;
        } else {
            humanYears = 22 + ((age - 2) * 5);
        }
        return humanYears;
    }

    public void printDetails() {
        System.out.println("Breed: " + breed);
        System.out.println("Age (in dog years): " + age);
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Labrador", 5, 25.5);
        dog.printDetails();
        System.out.println("Age in human years: " + dog.calculateAgeInHumanYears());
    }
}
