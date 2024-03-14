package Level_1;

// Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage." Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity and a method to print the computer's processor, RAM, and storage capacity.

public class Computer {
    private String processor;
    private int RAM;
    private int storage;

    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    public double calculatePrice() {
        double basePrice = 10000;
        double processorPrice = 0.0;
        double RAMPrice = 0.0;
        double storagePrice = 0.0;

        if (processor == "i9") {
            processorPrice = 30000;
        } else if (processor == "i7") {
            processorPrice = 20000;
        } else if (processor == "i5") {
            processorPrice = 10000;
        } else if (processor == "i3") {
            processorPrice = 5000;
        } else {
            processorPrice = 1000;
        }

        RAMPrice = RAM * 10.0;
        storagePrice = storage * 10.0;

        double totalPrice = basePrice + processorPrice + RAMPrice + storagePrice;

        return totalPrice;
    }

    public void printDetails() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("i9", 32, 1024);
        computer1.printDetails();
        System.out.println();

        Computer computer2 = new Computer("i3", 16, 512);
        computer2.printDetails();
    }
}
