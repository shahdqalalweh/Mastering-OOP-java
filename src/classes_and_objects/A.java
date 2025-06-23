package classes_and_objects;

public class A {
   public final int r=50;
    // Any class inherited from this class cant override this method because its final method
    public final void firstPrint() {
        System.out.println("welcome to java");
    }

    // Not final so we can override it
    public void secondPrint() {
        System.out.println("welcome to java");
    }

}
