package Assignment_03;

public class Employee {

    // Variable
    String name;
    int id;

    // Default Constructor
    public Employee() {
        name = "Default Name";
        id = 0;
    }

    // Parameterized Constructor
    public Employee(String empName, int empId) {
        name = empName;
        id = empId;
    }

    // Parameterized Method
    public void updateEmployee(String newName, int newId) {
        name = newName;
        id = newId;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    // Main method
    public static void main(String[] args) {

        // Create object using Default Constructor
        Employee emp1 = new Employee();
        System.out.println("Default Constructor:");
        emp1.displayEmployee();

        System.out.println("---");

        // Create object using Parameterized Constructor
        Employee emp2 = new Employee("Nusrat Jahan", 101);
        System.out.println("Parameterized Constructor:");
        emp2.displayEmployee();

        System.out.println("---");

        // Call Parameterized Method to update details
        emp2.updateEmployee("Nusrat Jahan popi", 202);
        System.out.println("After updating using method:");
        emp2.displayEmployee();
    }
}
