class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Single Inheritance
class Car extends Vehicle {
    String model = "Fortuner";

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        start();
    }
}

// Multilevel Inheritance
class Person {
    String name = "Rahul";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int empId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department = "IT";

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance
class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateCircleArea() {
        System.out.println("Area of Circle: " +
                (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10;
    int breadth = 5;

    void calculateRectangleArea() {
        System.out.println("Area of Rectangle: " +
                (length * breadth));
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("--- Single Inheritance ---");
        Car c = new Car();
        c.displayCar();

        // Multilevel Inheritance
        System.out.println("\n--- Multilevel Inheritance ---");
        Manager m = new Manager();
        m.displayName();
        m.displayEmployee();
        m.displayManager();

        // Hierarchical Inheritance
        System.out.println("\n--- Hierarchical Inheritance ---");
        Circle cir = new Circle();
        cir.display();
        cir.calculateCircleArea();

        Rectangle r = new Rectangle();
        r.display();
        r.calculateRectangleArea();
    }
}
