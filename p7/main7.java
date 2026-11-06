class Student {

    // Constructor
    Student() {
        System.out.println("Student object is created.");
    }

    // Method
    void display() {
        System.out.println("Student object is being used.");
    }

    // finalize() method (deprecated in modern Java)
    @Override
    protected void finalize() {
        System.out.println("Garbage Collector is cleaning the object.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Student s1 = new Student();

        // Using the object
        s1.display();

        // Removing the reference
        s1 = null;

        // Requesting Garbage Collection
        System.out.println("Requesting Garbage Collection...");

        System.gc();

        System.out.println("Garbage Collection request completed.");
    }
}
