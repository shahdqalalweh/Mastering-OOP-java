package ModifiersPac;

/*
Access Modifiers ==> Public, Private, Protected, Default(package private)

لا يمكنك تعريف كلاس كـ private.
abstract method cant be private because we cant override it
Functions that are declared as private are not inherited from any class

protected ==> Classes cant be protected
A function or variable that is declared as protected can only be accessed from classes in the same package or from classes that inherit from it.

 */
public class Student {

    private String firstName;
    private String lastName;
    private String specialization;
    private int id;
    private boolean isWork;
    final String theAvgerageForSuccess = "50%";
    static String CollegeName = "MIT";

    public void printFullName() {
        System.out.println("Name: " + firstName + " " + lastName);
    }

    public static void printCollegeName() {
        System.out.println("College: " + CollegeName);
    }

}
/*
Non Access Modifiers:

static
final
abstract
synchronized
native
transient
volatile
strictfp

 */