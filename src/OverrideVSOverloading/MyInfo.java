package OverrideVSOverloading;

public class MyInfo {

    public void displayInfo(String name) {
        System.out.println("name: " +name);
        System.out.println("---------------------");
    }

    public void displayInfo(String name, String lastName) {
        System.out.println("name: " +name);
        System.out.println("last name: " +lastName);
        System.out.println("---------------------");
    }

    public void displayInfo(String name, String lastName, String job) {
        System.out.println("name: " +name);
        System.out.println("last name: " +lastName);
        System.out.println("job: " +job);
        System.out.println("---------------------");
    }

}
