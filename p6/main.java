class Book {

    // Instance Variables
    String title;
    String author;
    double price;

    // No-Argument Constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // User-Defined Copy Constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }

    // Main Method
    public static void main(String[] args) {

        // Object using No-Argument Constructor
        Book b1 = new Book();

        // Object using Parameterized Constructor
        Book b2 = new Book("Java Programming", "James Gosling", 500);

        // Object using Copy Constructor
        Book b3 = new Book(b2);

        System.out.println("No-Argument Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        // Modifying copied object
        b3.price = 700;
        b3.title = "Advanced Java";

        System.out.println("After Modifying Copied Object:");

        System.out.println("Original Object (b2):");
        b2.display();

        System.out.println("Copied Object (b3):");
        b3.display();
    }
}
