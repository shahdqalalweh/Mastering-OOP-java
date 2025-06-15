package classes_and_objects;



public class User {
    int id;
    int age;
    String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void print() {
        System.out.println("Student Name is " + this.name + ", his age is " + this.age + ", and his ID is " + this.id);
    }
}

