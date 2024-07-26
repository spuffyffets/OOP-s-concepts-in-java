package Encapsulation;


public class StudentMain {
    public static void main(String[] args) {
        // Creating an object of Students
        Students student = new Students("Suchit Chaudhari", 1234, 85.5f, 18, 12);

        // Using getter methods to retrieve values
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Percentage: " + student.getPer());
        System.out.println("Age: " + student.getAge());
        System.out.println("Standard: " + student.getStd());

        // Using setter methods to set new values
        student.setName("Mohit");
        student.setAge(19);

        // Displaying updated information
        System.out.println("\nUpdated Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
