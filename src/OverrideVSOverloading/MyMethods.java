package OverrideVSOverloading;

public class MyMethods {

    public void sum(int a, int b) {
        System.out.println("First method is called ====> "+a+" + "+b+" = "+(a+b));
    }

    public void sum(float a, float b) {
        System.out.println("Second method is called ===> "+a+" + "+b+" = "+(a+b));
    }

    public void sum(double a, double b) {
        System.out.println("Third method is called ====> "+a+" + "+b+" = "+(a+b));
    }

}
