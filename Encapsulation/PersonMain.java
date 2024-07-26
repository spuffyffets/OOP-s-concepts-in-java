package Encapsulation;

// PersonMain.java
public class PersonMain {
    public static void main(String[] args) {
        // Creating two objects of Person
        Person person1 = new Person("Suchit Chaudhari", 28, "1234-5678-9101");
        Person person2 = new Person("Mohit Ingale", 32, "1098-7654-3210");

        // Using getter methods to retrieve values
        System.out.println("Initial Person Information:");
        person1.display();
        person2.display();

        // Using setter methods to set new values
        person1.setName("Durvesh");
        person1.setAge(29);
        person1.setAadharNo("4321-8765-1098");

        person2.setName("Yash");
        person2.setAge(33);
        person2.setAadharNo("0987-6543-2101");

        // Displaying updated information
        System.out.println("\nUpdated Person Information:");
        person1.display();
        person2.display();
    }
}
