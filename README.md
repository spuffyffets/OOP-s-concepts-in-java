# Understanding Object-Oriented Programming (OOP) Concepts in Java

This guide provides an overview of the four main Object-Oriented Programming (OOP) concepts in Java: Encapsulation, Inheritance, Polymorphism, and Abstraction. These concepts are fundamental to understanding and writing effective Java code.

## 1. Encapsulation

Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class are hidden from other classes and can be accessed only through the methods of their current class. This is also known as data hiding.

### Example
```java
public class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
