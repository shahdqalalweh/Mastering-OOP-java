package StaticPac;

public class Order {
    private  int Order_id;
    private double Order_amount;

    public static int getCounter() {
        return counter;
    }

    public static void setCounter() {
        if (counter ==500)
            counter=0;
        counter++;
    }

    private  static int  counter =0;

    public Order( double order_amount) {


        Order_id = counter+1;
        Order_amount = order_amount;
       setCounter();

    }

    public Order() {

        Order_id = counter+1;
        Order_amount = 0; // Canceled order
        setCounter();
    }

   public static void main(String[] args){
        Order Omar = new Order(20);
       Order Ali = new Order(25);
       Order Mahmoood = new Order(23);
       Order Mohammad = new Order(15);
       Order Salma = new Order(10);
       Order Ameera = new Order();
       Order Tala = new Order();
       Order Rahaf = new Order(17);

       System.out.println("Amount   "+Omar.Order_amount);
       System.out.println("Order    " + Omar.Order_id);
       System.out.println("Order Counter " + Ali.counter);// Warrning
       System.out.println("Order Counter " + Order.counter); // we can use static attribute without crating an Object
// the best way is by generating static method getCounter()
       System.out.println("Order Counter "+ getCounter());

       /*
       static variable can access static variable and method
       static  method  can access static variable and method
       Non-static variable and method can access for each static variable and method and Non-static variable and method
        */
   }
}

