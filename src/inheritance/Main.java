package inheritance;

class Animal { }

class Mammals  extends Animal { }
class Reptiles extends Animal { }
class Birds    extends Animal { }
class Aquatic  extends Animal { }


class Dog      extends Mammals { }
class Snack    extends Reptiles { }
class Parrot   extends Birds { }
class Dolphin  extends Aquatic { }


public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        System.out.println( dog1 instanceof Dog);
        System.out.println( dog1 instanceof Animal);

    }

}