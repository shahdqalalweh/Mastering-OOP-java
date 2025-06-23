package classes_and_objects;

// Blue print
public class Gamer {


    //Instance Variables
    int health, stringth;
    String name ;

    public Gamer(){} // default constructor (Auto)

    public Gamer( String name){
        this.name = name;
       // name = name; لو عملنا هيك رح تتخزن ال name = null ==> Default   ==> Logical Error

        this.health = 100;
        this.stringth = 10;
        //Local Variables

    }
// set => void & get => return with the same data type

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setStringth(int stringth) {
        this.stringth = stringth;
    }

    public int getStringth() {
        return stringth;
    }

    public void attack(Gamer g){
       g.setHealth(g.getHealth()-this.stringth);
    }
}
