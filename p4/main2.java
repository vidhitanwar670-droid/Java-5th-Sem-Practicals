// Method Overloading
class Calculator {

    // Adding two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adding three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adding two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Base Class
class Employee {

    double calculatePay() {
        return 20000;
    }
}

// First Derived Class
class FullTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 30000;
    }
}

// Second Derived Class
class PartTimeEmployee extends Employee {

    @Override
    double calculatePay() {
        return 15000;
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Method Overloading
        System.out.println("--- Method Overloading ---");

        Calculator c = new Calculator();

        System.out.println("Addition of two integers: " +
                c.add(10, 20));

        System.out.println("Addition of three integers: " +
                c.add(10, 20, 30));

        System.out.println("Addition of two double values: " +
                c.add(10.5, 20.5));

        // Method Overriding
        System.out.println("\n--- Method Overriding ---");

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full Time Employee Pay: " +
                e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part Time Employee Pay: " +
                e.calculatePay());
    }
}
