package encapsulation;

public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setName("dj");
        e.setAge(21);
        e.setSalary(1500000);

        System.out.println(e.getName());
        System.out.println("Age: "    +e.getAge());
        System.out.println("Salary: " +e.getSalary());

    }

}
