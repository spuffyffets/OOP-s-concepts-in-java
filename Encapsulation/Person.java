package Encapsulation;

// Person.java
public class Person {
    private String name;
    private int age;
    private String aadharNo;

    // Constructor
    public Person(String name, int age, String aadharNo) {
        this.name = name;
        this.age = age;
        this.aadharNo = aadharNo;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    // Display method
    public void display() {
        System.out.println("Person Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Aadhar No: " + aadharNo);
    }
}
