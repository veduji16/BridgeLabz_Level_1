package Level_1;

//   Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt based on  its size and a method to print the shirt's size, color, and discounted price

public class Shirt {
    private String color;
    private String size;
    private double price;

    public Shirt(String color, String size, int price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public double calculatePrice() {
        double discount = 0.0;
        if (size == "XL") {
            discount = 0.5 * price;
        } else if (size == "L") {
            discount = 0.4 * price;
        } else if (size == "M") {
            discount = 0.3 * price;
        } else {
            discount = 0.2 * price;
        }
        return discount;
    }

    public void printDetails() {
        double discountedPrice = price - calculatePrice();
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("Green", "L", 350);
        shirt1.printDetails();
        System.out.println();
        Shirt shirt2 = new Shirt("Blue", "XL", 500);
        shirt2.printDetails();
    }
}
