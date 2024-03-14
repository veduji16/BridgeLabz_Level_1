package Level_1;

//   Write a Java program to create a class called "Phone" with instance variables "make," "model," and "storage." Include a method to calculate the price of the phone based on the make, model, and storage capacity and a method to print the phone's make, model, and storage capacity.

public class Phone {
    private String make;
    private String model;
    private int storage;

    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 12719;
        double pricePerGB = 10;
        return basePrice + (storage * pricePerGB);

    }

    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage);
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Motorola", "G54 5G", 128);
        phone.printDetails();
        System.out.println("Price: $" + phone.calculatePrice());
    }
}
