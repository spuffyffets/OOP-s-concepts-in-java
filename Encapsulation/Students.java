package Encapsulation;

// Students.java
public class Students {
    private String name;
    private int id;
    private float per;
    private int age;
    private int std;

    // Constructor
    public Students(String name, int id, float per, int age, int std) {
        this.name = name;
        this.id = id;
        this.per = per;
        this.age = age;
        this.std = std;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }
}
