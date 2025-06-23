package OverrideVSOverloading;

public class Main {

    public static void main(String[] args) {

        Australia au = new Australia();
        Palestine   pal = new Palestine();
        Spain     sp = new Spain();

        au.language();
        pal.language();
        sp.language();



        MyMethods m = new MyMethods();

        m.sum(1000, 4000);
        m.sum(10f, 40f);
        m.sum(10d, 40d);



        MyInfo aa = new MyInfo();
        aa.displayInfo("Mhamad");
        aa.displayInfo("Mhamad", "Ali");
        aa.displayInfo("Mhamad", "Ali", "programmer");

    }

}
/*
The access modifier of the overridden method must be the same as or more accessible than the original method. It must be either public or protected.

The number and types of parameters in the overriding method must exactly match those of the original method.

The return type of the overriding method must be the same as the return type of the original method.

A method declared as private cannot be overridden because private restricts access from subclasses.

A method declared as final cannot be overridden because final prevents modification of the method’s implementation.

A method declared as static cannot be overridden, but it can be redefined in another class since static methods belong to the class, not to instances.

Constructors cannot be overridden.
 */
/*
Overloading applies only to methods and constructors.

They must have the same name.

They must differ in the type or number of parameters.

The return type does not matter — the compiler cannot distinguish overloaded methods based on return type alone.
 */