class Product {

    // Instance Variables
    String productName;
    double price;
    int quantity;

    // 1. No-Argument Constructor
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Constructor with Product Name
    Product(String name) {
        productName = name;
        price = 0.0;
        quantity = 0;
    }

    // 3. Constructor with Product Name and Price
    Product(String name, double p) {
        productName = name;
        price = p;
        quantity = 1;
    }

    // 4. Constructor with All Three Fields
    Product(String name, double p, int q) {
        productName = name;
        price = p;
        quantity = q;
    }

    // Method to calculate total cost
    double calculateTotalCost() {
        return price * quantity;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("--------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        // Creating objects using different constructors

        Product p1 = new Product();

        Product p2 = new Product("Laptop");

        Product p3 = new Product("Mobile", 15000);

        Product p4 = new Product("Keyboard", 800, 3);

        System.out.println("No-Argument Constructor:");
        p1.display();

        System.out.println("Product Name Constructor:");
        p2.display();

        System.out.println("Name and Price Constructor:");
        p3.display();

        System.out.println("All Fields Constructor:");
        p4.display();
    }
}
