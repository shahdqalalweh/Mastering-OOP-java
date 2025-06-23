package classes_and_objects;

public class ABTest {

    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.r);
        B b = new B();
        System.out.println(b.r);
        // final methode بنقدر نورثها بس ما بنقدر نعمللها override والاتربيوتس كذلك
        // لكن ال Final class هو اللي ما بنقدر نورثه
        a.firstPrint();
        a.secondPrint();

        b.firstPrint();
        b.secondPrint();

    }


}
