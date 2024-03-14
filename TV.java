package Level_1;

public class TV {
    private String brand;
    private int size;
    private int price;

    public TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public double calculatePrice() {
        double basePrice = 10000;
        double pricePerSize = 10;
        return basePrice + (size * pricePerSize);
    }

    public void printDetails() {
        double discountedPrice = price - calculatePrice();
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        TV tv = new TV("Sony", 42, 20000);
        tv.printDetails();
    }
}
