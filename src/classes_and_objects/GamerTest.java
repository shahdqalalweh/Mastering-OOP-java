package classes_and_objects;

public class GamerTest
{
    public static void main(String[] args){
        Gamer g1 = new Gamer("First Gamer");
        Gamer g2 = new Gamer ("Second Gamer");



        System.out.println(g2.getHealth());
        g1.attack(g2);
        g1.attack(g2);
        g1.attack(g2);
        g1.attack(g2);
        g1.attack(g2);
        System.out.println(g1.getHealth());
        g2.attack(g1);
        System.out.println(g1.getHealth());

        System.out.println(g2.getHealth());


    }
}
