interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Implementing two interfaces
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printer is printing a document.");
    }

    public void scan() {
        System.out.println("Scanner is scanning a document.");
    }
}

// Base Class
class Machine {
    void start() {
        System.out.println("Machine is starting.");
    }
}

// Derived Class implementing an interface
class SmartPrinter extends Machine implements Printable, Scannable {

    public void print() {
        System.out.println("Smart Printer is printing.");
    }

    public void scan() {
        System.out.println("Smart Printer is scanning.");
    }

    void display() {
        System.out.println("This is a Smart Printer.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Multiple Inheritance using Interfaces
        System.out.println("--- Multiple Inheritance ---");

        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        // Hybrid Inheritance
        System.out.println("\n--- Hybrid Inheritance ---");

        SmartPrinter s = new SmartPrinter();
        s.start();
        s.print();
        s.scan();
        s.display();
    }
}
