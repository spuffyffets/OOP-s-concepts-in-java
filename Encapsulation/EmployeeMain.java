package Encapsulation;

// EmployeeMain.java
public class EmployeeMain {
    public static void main(String[] args) {
        // Creating an object of Employee
        Employee employee = new Employee("Suchit Chaudhari", 5678, 21, 75000.0f, 9876543210L);

        // Using getter methods to retrieve values
        System.out.println("Initial Employee Information:");
        employee.display();

        // Using setter methods to set new values
        employee.setName("Mohit");
        employee.setAge(21);

        // Displaying updated information
        System.out.println("\nUpdated Employee Information:");
        employee.display();
    }
}
