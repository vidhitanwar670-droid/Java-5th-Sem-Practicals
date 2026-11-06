class Employee {

    // Instance Variables
    String name;
    double salary;

    // Static Variable
    static int count = 0;

    // No-Argument Constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

        count++;

    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    // Static Method
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }

    // Main Method
    public static void main(String[] args) {

        // Creating objects
        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 30000);

        Employee e3 = new Employee("Priya", 40000);

        // Displaying employee details
        e1.display();
        e2.display();
        e3.display();

        // Displaying total employee count
        Employee.displayCount();
    }
}
