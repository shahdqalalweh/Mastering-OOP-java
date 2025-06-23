package encapsulation;

public class Employee {

    private String name;
    private int    age;
    private double salary;


    public String getName() {            // مع إظهار جملة صغيرة قبلها name هذه الدالة ترجع قيمة الخاصية
        return "Name: " +name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public void setName(String n) {
        if (n.length() < 3) {
            System.out.println("Name is too short, name can't be less then 3 characters!");
        }
        else {
            name = n;
        }
    }

    public void setAge(int a) {
        age = a;
    }

    public void setSalary(double s) {
        salary = s;
    }

}
