package Level_1;

// Write a Java program to create a class called "Furniture" with instance variables "type," "material," and "price." Include a method to calculate the discount on the furniture based on its material and a method to print the furniture's type, material, and discounted price.

public class Furniture {
    private String type;
    private String material;
    private int price;

    public Furniture(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public double calculatePrice() {
        double basePrice = 10000;
        double materialPrice = 0.0;

        if (material == "Wood") {
            materialPrice = 15000;
        } else if (material == "Iron") {
            materialPrice = 10000;
        } else if (material == "PVC") {
            materialPrice = 5000;
        } else if (material == "Plastic") {
            materialPrice = 3000;
        } else {
            materialPrice = 1000;
        }
        
        double totalPrice = basePrice + materialPrice;
        return totalPrice;
    }

    public void printDetails() {
        double discountedPrice = price - calculatePrice();
        System.out.println("Price: $" + price);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material + " inches");
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Sofa", "Wood", 80000);
        furniture1.printDetails();
        System.out.println();

        Furniture furniture2 = new Furniture("Dinning Table", "Iron", 50000);
        furniture2.printDetails();
    }
}
