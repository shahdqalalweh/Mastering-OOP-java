package classes_and_objects;

public class UserTest {
    public static void main(String[] args) {
        User u = new User(101, 22, "Shahd");
        u.print();
        System.out.println(u.getClass().getName());
        System.out.println(u); // memory address before override toString Method
        System.out.println(u.toString());
    }
}